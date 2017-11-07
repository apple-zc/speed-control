package com.qiqian.speedcontrol.springboot.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;

public class ScheduleRule {

    public String getEnterCondition() {
        return enterCondition;
    }

    public void setEnterCondition(String enterCondition) {
        this.enterCondition = enterCondition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public int getRuleStatus() {
        return ruleStatus;
    }

    public void setRuleStatus(int ruleStatus) {
        this.ruleStatus = ruleStatus;
    }

    public boolean isSchedulable() {
        return isSchedulable;
    }

    public void setSchedulable(boolean schedulable) {
        isSchedulable = schedulable;
    }

    public String getSchedulePolicy() {
        return schedulePolicy;
    }

    public void setSchedulePolicy(String schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
    }

    public Long getScheduleRate() {
        return scheduleRate;
    }

    public void setScheduleRate(Long scheduleRate) {
        this.scheduleRate = scheduleRate;
    }

    public String getSortExpression() {
        return sortExpression;
    }

    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 规则进入条件
     */
    private String enterCondition;

    /**
     * 主键
     */
    private Long id;

    /**
     * 父规则id
     */
    private Long parentId;

    /**
     * 规则代码
     */
    private String ruleCode;

    /**
     * 规则状态
     */
    private int ruleStatus = 1;

    /**
     * 是否可调度（用于控制调度器执行，不做数据库存储，默认可调度）
     */
    private boolean isSchedulable = true;

    /**
     * 调度策略，crontab表达式，只有主调度规则可以设置，其它设置无效
     */
    private String schedulePolicy;

    /**
     * 调度速率
     */
    private Long scheduleRate;

    /**
     * 排序表达式
     */
    private String sortExpression;

    /**
     * 规则版本号
     */
    private int version = 0;

    private int weight = 1;

    @JSONField(serialize=false)
    private String ruleGroup;

    public String getRuleGroup() {
        if (StringUtils.isEmpty(ruleCode)) {
            return null;
        }

        return ruleCode.substring(0, ruleCode.length() - 1);
    }
}
