package com.deaifish.cloud.entities;

import java.util.Date;
import javax.persistence.*;

/**
 * 表名：INCOME
*/
@Table(name = "INCOME")
public class Income {
    /**
     * 收入ID
     */
    @Id
    @Column(name = "income_id")
    private Integer incomeId;

    /**
     * 金额
     */
    private Float money;

    /**
     * 收入时间
     */
    private Date time;

    /**
     * 收入类型
     */
    private String type;

    /**
     * 收入账户
     */
    @Column(name = "account_id")
    private Integer accountId;

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
     * 获取收入ID
     *
     * @return incomeId - 收入ID
     */
    public Integer getIncomeId() {
        return incomeId;
    }

    /**
     * 设置收入ID
     *
     * @param incomeId 收入ID
     */
    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
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
     * 获取收入时间
     *
     * @return time - 收入时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置收入时间
     *
     * @param time 收入时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取收入类型
     *
     * @return type - 收入类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置收入类型
     *
     * @param type 收入类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取收入账户
     *
     * @return accountId - 收入账户
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置收入账户
     *
     * @param accountId 收入账户
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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