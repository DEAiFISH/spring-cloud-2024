package com.deaifish.cloud.entities;

import java.util.Date;
import javax.persistence.*;

/**
 * 表名：CYCLE
*/
@Table(name = "CYCLE")
public class Cycle {
    /**
     * 周期计划ID
     */
    @Id
    @Column(name = "cycle_id")
    private Integer cycleId;

    /**
     * 周期计划名
     */
    private String name;

    /**
     * 金额
     */
    private Float money;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 账户ID
     */
    @Column(name = "account_id")
    private Integer accountId;

    /**
     * 收支类型
     */
    private String type;

    /**
     * 描述
     */
    private String description;

    /**
     * 重复(1:每天；2:每周；3:每月；4:每年)
     */
    private Integer plan;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取周期计划ID
     *
     * @return cycleId - 周期计划ID
     */
    public Integer getCycleId() {
        return cycleId;
    }

    /**
     * 设置周期计划ID
     *
     * @param cycleId 周期计划ID
     */
    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    /**
     * 获取周期计划名
     *
     * @return name - 周期计划名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置周期计划名
     *
     * @param name 周期计划名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public Float getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取账户ID
     *
     * @return accountId - 账户ID
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置账户ID
     *
     * @param accountId 账户ID
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取收支类型
     *
     * @return type - 收支类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置收支类型
     *
     * @param type 收支类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取重复(1:每天；2:每周；3:每月；4:每年)
     *
     * @return plan - 重复(1:每天；2:每周；3:每月；4:每年)
     */
    public Integer getPlan() {
        return plan;
    }

    /**
     * 设置重复(1:每天；2:每周；3:每月；4:每年)
     *
     * @param plan 重复(1:每天；2:每周；3:每月；4:每年)
     */
    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return updateTime - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}