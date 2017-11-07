package com.qiqian.speedcontrol.springboot.manager.impl;

import com.google.common.collect.Maps;
import com.qiqian.speedcontrol.springboot.manager.ScheduleRuleManager;
import com.qiqian.speedcontrol.springboot.model.ScheduleRule;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ScheduleRuleManagerImpl implements ScheduleRuleManager {

    private static final int GROUP_SIZE = 10;

    private static final String RULE_GROUP_MAIN_OTHER = "main_isYace_other_";
    private static final String RULE_GROUP_STORE_OTHER = "store_isYace_other_";

    private static final String RULE_GROUP_MAIN_5000000000002 = "main_isYace_5000000000002_";
    private static final String RULE_GROUP_STORE_5000000000002 = "store_isYace_5000000000002_";

    private static final String RULE_GROUP_MAIN_5000000000014 = "main_isYace_5000000000014_";
    private static final String RULE_GROUP_STORE_5000000000014 = "store_isYace_5000000000014_";

    private static final String RULE_GROUP_MAIN_5000000000001 = "main_isYace_5000000000001_";
    private static final String RULE_GROUP_STORE_5000000000001 = "store_isYace_5000000000001_";

    private static final String RULE_GROUP_MAIN_5000000000013 = "main_isYace_5000000000013_";
    private static final String RULE_GROUP_STORE_5000000000013 = "store_isYace_5000000000013_";

    private static final String RULE_GROUP_MAIN_5000000000059 = "main_isYace_5000000000059_";
    private static final String RULE_GROUP_STORE_5000000000059 = "store_isYace_5000000000059_";

    private static final String RULE_GROUP_MAIN_5000000000009 = "main_isYace_5000000000009_";
    private static final String RULE_GROUP_STORE_5000000000009 = "store_isYace_5000000000009_";

    @Override
    public Map<String, Long> aggregate(List<ScheduleRule> scheduleRuleList) {
        if (CollectionUtils.isEmpty(scheduleRuleList)) {
            return Maps.newHashMap();
        }

        Map<String, Long> resultMap = Maps.newHashMap();

        for (ScheduleRule scheduleRule : scheduleRuleList) {
            Long rate = resultMap.get(scheduleRule.getRuleGroup());

            if (rate == null) {
                resultMap.put(scheduleRule.getRuleGroup(), scheduleRule.getScheduleRate());
            } else {
                resultMap.put(scheduleRule.getRuleGroup(), rate + scheduleRule.getScheduleRate());
            }
        }

        return resultMap;
    }

    @Override
    public void modify(List<ScheduleRule> scheduleRuleList,
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
                       Long store_5000000000009_speed) {
        if (CollectionUtils.isEmpty(scheduleRuleList)) {
            return;
        }

        if (main_other_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_OTHER)) {
                    scheduleRule.setScheduleRate(main_other_speed / GROUP_SIZE);
                }
            }
        }
        if (store_other_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_OTHER)) {
                    scheduleRule.setScheduleRate(store_other_speed / GROUP_SIZE);
                }
            }
        }

        if (main_5000000000002_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_5000000000002)) {
                    scheduleRule.setScheduleRate(main_5000000000002_speed / GROUP_SIZE);
                }
            }
        }
        if (store_5000000000002_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_5000000000002)) {
                    scheduleRule.setScheduleRate(store_5000000000002_speed / GROUP_SIZE);
                }
            }
        }

        if (main_5000000000014_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_5000000000014)) {
                    scheduleRule.setScheduleRate(main_5000000000014_speed / GROUP_SIZE);
                }
            }
        }
        if (store_5000000000014_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_5000000000014)) {
                    scheduleRule.setScheduleRate(store_5000000000014_speed / GROUP_SIZE);
                }
            }
        }

        if (main_5000000000001_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_5000000000001)) {
                    scheduleRule.setScheduleRate(main_5000000000001_speed / GROUP_SIZE);
                }
            }
        }
        if (store_5000000000001_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_5000000000001)) {
                    scheduleRule.setScheduleRate(store_5000000000001_speed / GROUP_SIZE);
                }
            }
        }

        if (main_5000000000013_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_5000000000013)) {
                    scheduleRule.setScheduleRate(main_5000000000013_speed / GROUP_SIZE);
                }
            }
        }
        if (store_5000000000013_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_5000000000013)) {
                    scheduleRule.setScheduleRate(store_5000000000013_speed / GROUP_SIZE);
                }
            }
        }

        if (main_5000000000059_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_5000000000059)) {
                    scheduleRule.setScheduleRate(main_5000000000059_speed / GROUP_SIZE);
                }
            }
        }
        if (store_5000000000059_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_5000000000059)) {
                    scheduleRule.setScheduleRate(store_5000000000059_speed / GROUP_SIZE);
                }
            }
        }

        if (main_5000000000009_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_MAIN_5000000000009)) {
                    scheduleRule.setScheduleRate(main_5000000000009_speed / GROUP_SIZE);
                }
            }
        }
        if (store_5000000000009_speed != null) {
            for (ScheduleRule scheduleRule : scheduleRuleList) {
                if (StringUtils.equals(scheduleRule.getRuleGroup(), RULE_GROUP_STORE_5000000000009)) {
                    scheduleRule.setScheduleRate(store_5000000000009_speed / GROUP_SIZE);
                }
            }
        }

        return;
    }
}
