package com.qiqian.speedcontrol.springboot.manager;

import com.qiqian.speedcontrol.springboot.model.ScheduleRule;

import java.util.List;
import java.util.Map;

public interface ScheduleRuleManager {

    Map<String, Long> aggregate(List<ScheduleRule> scheduleRuleList);

    void modify(List<ScheduleRule> scheduleRuleList,
                Long main_other_speed,
                Long store_other_speed,
                Long main_5000000000002_speed,
                Long store_5000000000002_speed,
                Long main_5000000000014_speed,
                Long store_5000000000014_speed,
                Long main_5000000000001_speed,
                Long store_5000000000001_speed,
                Long main_5000000000013_speed,
                Long store_5000000000013_speed,
                Long main_5000000000059_speed,
                Long store_5000000000059_speed,
                Long main_5000000000009_speed,
                Long store_5000000000009_speed);
}
