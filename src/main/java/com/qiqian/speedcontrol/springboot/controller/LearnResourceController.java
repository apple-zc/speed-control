package com.qiqian.speedcontrol.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.qiqian.speedcontrol.springboot.manager.ScheduleRuleManager;
import com.qiqian.speedcontrol.springboot.model.ScheduleRule;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class LearnResourceController {

    @Resource
    private ScheduleRuleManager scheduleRuleManager;

    @RequestMapping("/speed")
    public ModelAndView speed() {
        ModelAndView modelAndView = new ModelAndView("/speed");
        return modelAndView;
    }

    @RequestMapping(value = "/speed/submit", method = RequestMethod.POST)
    public ModelAndView speedSubmit(@RequestParam("configOriginal") String configOriginal,
                                    @RequestParam(value = "main_other_speed", required = false) Long main_other_speed,
                                    @RequestParam(value = "store_other_speed", required = false) Long store_other_speed,
                                    @RequestParam(value = "main_5000000000002_speed", required = false) Long main_5000000000002_speed,
                                    @RequestParam(value = "store_5000000000002_speed", required = false) Long store_5000000000002_speed,
                                    @RequestParam(value = "main_5000000000014_speed", required = false) Long main_5000000000014_speed,
                                    @RequestParam(value = "store_5000000000014_speed", required = false) Long store_5000000000014_speed,
                                    @RequestParam(value = "main_5000000000001_speed", required = false) Long main_5000000000001_speed,
                                    @RequestParam(value = "store_5000000000001_speed", required = false) Long store_5000000000001_speed,
                                    @RequestParam(value = "main_5000000000013_speed", required = false) Long main_5000000000013_speed,
                                    @RequestParam(value = "store_5000000000013_speed", required = false) Long store_5000000000013_speed,
                                    @RequestParam(value = "main_5000000000059_speed", required = false) Long main_5000000000059_speed,
                                    @RequestParam(value = "store_5000000000059_speed", required = false) Long store_5000000000059_speed,
                                    @RequestParam(value = "main_5000000000009_speed", required = false) Long main_5000000000009_speed,
                                    @RequestParam(value = "store_5000000000009_speed", required = false) Long store_5000000000009_speed) {
        List<ScheduleRule> scheduleRuleList = JSON.parseArray(configOriginal, ScheduleRule.class);

        scheduleRuleManager.modify(scheduleRuleList,
                main_other_speed,
                store_other_speed,
                main_5000000000002_speed,
                store_5000000000002_speed,
                main_5000000000014_speed,
                store_5000000000014_speed,
                main_5000000000001_speed,
                store_5000000000001_speed,
                main_5000000000013_speed,
                store_5000000000013_speed,
                main_5000000000059_speed,
                store_5000000000059_speed,
                main_5000000000009_speed,
                store_5000000000009_speed);

        Map<String, Long> map = scheduleRuleManager.aggregate(scheduleRuleList);

        ModelAndView modelAndView = new ModelAndView("/speed");
        modelAndView.addObject("configResult", JSON.toJSON(scheduleRuleList));
        modelAndView.addAllObjects(map);


        Long mainSpeedTotal = 0L;
        Long storeSpeedTotal = 0L;

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            String k;
            Long v;
            try {
                k = entry.getKey();
                v = entry.getValue();
            } catch(IllegalStateException ise) {
                // this usually means the entry is no longer in the map.
                throw new ConcurrentModificationException(ise);
            }

            if (k.startsWith("main")) {
                mainSpeedTotal = mainSpeedTotal + v;
            }
            if (k.startsWith("store")) {
                storeSpeedTotal =  storeSpeedTotal + v;
            }
        }



        modelAndView.addObject("mainSpeedTotal", mainSpeedTotal);
        modelAndView.addObject("storeSpeedTotal", storeSpeedTotal);
        return modelAndView;
    }
}
