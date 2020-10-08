package com.example.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "bill")
public class BillItem {
    @Id
    @Column(name = "bill_id")
    private Integer billId;

    @Column(name = "account_id")
    private Integer accountId;

    /**
     * 账单月份 YYYY-MM
     */
    @Column(name = "bill_month")
    private String billMonth;

    /**
     * 月费用
     */
    @Column(name = "bill_cost")
    private Double billCost;

    /**
     * 支付方式 0-现金  1-银行转账  2-支付宝 3-微信 4-其他
     */
    @Column(name = "pay_mode")
    private String payMode;

    /**
     * 支付状态 0-未支付  1-已支付  默认0
     */
    @Column(name = "pay_state")
    private String payState;

    /**
     * @return bill_id
     */
    public Integer getBillId() {
        return billId;
    }

    /**
     * @param billId
     */
    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    /**
     * @return account_id
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账单月份 YYYY-MM
     *
     * @return bill_month - 账单月份 YYYY-MM
     */
    public String getBillMonth() {
        return billMonth;
    }

    /**
     * 设置账单月份 YYYY-MM
     *
     * @param billMonth 账单月份 YYYY-MM
     */
    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth == null ? null : billMonth.trim();
    }

    /**
     * 获取月费用
     *
     * @return bill_cost - 月费用
     */
    public Double getBillCost() {
        return billCost;
    }

    /**
     * 设置月费用
     *
     * @param billCost 月费用
     */
    public void setBillCost(Double billCost) {
        this.billCost = billCost;
    }

    /**
     * 获取支付方式 0-现金  1-银行转账  2-支付宝 3-微信 4-其他
     *
     * @return pay_mode - 支付方式 0-现金  1-银行转账  2-支付宝 3-微信 4-其他
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * 设置支付方式 0-现金  1-银行转账  2-支付宝 3-微信 4-其他
     *
     * @param payMode 支付方式 0-现金  1-银行转账  2-支付宝 3-微信 4-其他
     */
    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    /**
     * 获取支付状态 0-未支付  1-已支付  默认0
     *
     * @return pay_state - 支付状态 0-未支付  1-已支付  默认0
     */
    public String getPayState() {
        return payState;
    }

    /**
     * 设置支付状态 0-未支付  1-已支付  默认0
     *
     * @param payState 支付状态 0-未支付  1-已支付  默认0
     */
    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }
}