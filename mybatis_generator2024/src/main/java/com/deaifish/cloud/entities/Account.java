package com.deaifish.cloud.entities;

import java.util.Date;
import javax.persistence.*;

/**
 * 表名：ACCOUNT
*/
@Table(name = "ACCOUNT")
public class Account {
    /**
     * 账户ID
     */
    @Id
    @Column(name = "account_id")
    private Integer accountId;

    /**
     * 账户名
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 金额
     */
    private Float balance;

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
     * 获取账户名
     *
     * @return name - 账户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置账户名
     *
     * @param name 账户名
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取金额
     *
     * @return balance - 金额
     */
    public Float getBalance() {
        return balance;
    }

    /**
     * 设置金额
     *
     * @param balance 金额
     */
    public void setBalance(Float balance) {
        this.balance = balance;
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