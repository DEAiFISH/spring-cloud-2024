package com.deaifish.cloud.entities;

import java.util.Date;
import javax.persistence.*;

/**
 * 表名：EXPENDITURE
*/
@Table(name = "EXPENDITURE")
public class Expenditure {
    /**
     * 支出ID
     */
    @Id
    @Column(name = "expenditure_id")
    private Integer expenditureId;

    /**
     * 金额
     */
    private Float money;

    /**
     * 支出时间
     */
    private Date time;

    /**
     * 支出类型
     */
    private String type;

    /**
     * 支出账户
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
     * 获取支出ID
     *
     * @return expenditureId - 支出ID
     */
    public Integer getExpenditureId() {
        return expenditureId;
    }

    /**
     * 设置支出ID
     *
     * @param expenditureId 支出ID
     */
    public void setExpenditureId(Integer expenditureId) {
        this.expenditureId = expenditureId;
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
     * 获取支出时间
     *
     * @return time - 支出时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置支出时间
     *
     * @param time 支出时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取支出类型
     *
     * @return type - 支出类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置支出类型
     *
     * @param type 支出类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取支出账户
     *
     * @return accountId - 支出账户
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置支出账户
     *
     * @param accountId 支出账户
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