package com.deaifish.cloud.entities;

import java.util.Date;
import javax.persistence.*;

/**
 * 表名：SAVE
*/
@Table(name = "SAVE")
public class Save {
    /**
     * 存钱计划ID
     */
    @Id
    @Column(name = "save_id")
    private Integer saveId;

    /**
     * 存钱计划名
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
     * 目标金额
     */
    @Column(name = "target_amount")
    private Float targetAmount;

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
     * 获取存钱计划ID
     *
     * @return saveId - 存钱计划ID
     */
    public Integer getSaveId() {
        return saveId;
    }

    /**
     * 设置存钱计划ID
     *
     * @param saveId 存钱计划ID
     */
    public void setSaveId(Integer saveId) {
        this.saveId = saveId;
    }

    /**
     * 获取存钱计划名
     *
     * @return name - 存钱计划名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置存钱计划名
     *
     * @param name 存钱计划名
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
     * 获取目标金额
     *
     * @return targetAmount - 目标金额
     */
    public Float getTargetAmount() {
        return targetAmount;
    }

    /**
     * 设置目标金额
     *
     * @param targetAmount 目标金额
     */
    public void setTargetAmount(Float targetAmount) {
        this.targetAmount = targetAmount;
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