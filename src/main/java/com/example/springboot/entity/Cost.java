package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "cost")
public class Cost {
    @Id
    @Column(name = "cost_id")
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer costId;

    @Column(name = "cost_name")
    private String costName;

    @Column(name = "cost_base_duration")
    private Integer costBaseDuration;

    @Column(name = "cost_base_cost")
    private Double costBaseCost;

    @Column(name = "cost_unit_cost")
    private Double costUnitCost;

    /**
     * 0-开通  1-暂停
     */
    @Column(name = "cost_status")
    private String costStatus;

    @Column(name = "cost_descr")
    private String costDescr;

    @Column(name = "cost_creattime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date costCreattime;

    @Column(name = "cost_starttime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date costStarttime;

    /**
     * 1-包月 2-套餐  3-计费
     */
    @Column(name = "cost_type")
    private String costType;

    /**
     * @return cost_id
     */
    public Integer getCostId() {
        return costId;
    }

    /**
     * @param costId
     */
    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    /**
     * @return cost_name
     */
    public String getCostName() {
        return costName;
    }

    /**
     * @param costName
     */
    public void setCostName(String costName) {
        this.costName = costName == null ? null : costName.trim();
    }

    /**
     * @return cost_base_duration
     */
    public Integer getCostBaseDuration() {
        return costBaseDuration;
    }

    /**
     * @param costBaseDuration
     */
    public void setCostBaseDuration(Integer costBaseDuration) {
        this.costBaseDuration = costBaseDuration;
    }

    /**
     * @return cost_base_cost
     */
    public Double getCostBaseCost() {
        return costBaseCost;
    }

    /**
     * @param costBaseCost
     */
    public void setCostBaseCost(Double costBaseCost) {
        this.costBaseCost = costBaseCost;
    }

    /**
     * @return cost_unit_cost
     */
    public Double getCostUnitCost() {
        return costUnitCost;
    }

    /**
     * @param costUnitCost
     */
    public void setCostUnitCost(Double costUnitCost) {
        this.costUnitCost = costUnitCost;
    }

    /**
     * 获取0-开通  1-暂停
     *
     * @return cost_status - 0-开通  1-暂停
     */
    public String getCostStatus() {
        return costStatus;
    }

    /**
     * 设置0-开通  1-暂停
     *
     * @param costStatus 0-开通  1-暂停
     */
    public void setCostStatus(String costStatus) {
        this.costStatus = costStatus == null ? null : costStatus.trim();
    }

    /**
     * @return cost_descr
     */
    public String getCostDescr() {
        return costDescr;
    }

    /**
     * @param costDescr
     */
    public void setCostDescr(String costDescr) {
        this.costDescr = costDescr == null ? null : costDescr.trim();
    }

    /**
     * @return cost_creattime
     */
    public Date getCostCreattime() {
        return costCreattime;
    }

    /**
     * @param costCreattime
     */
    public void setCostCreattime(Date costCreattime) {
        this.costCreattime = costCreattime;
    }

    /**
     * @return cost_starttime
     */
    public Date getCostStarttime() {
        return costStarttime;
    }

    /**
     * @param costStarttime
     */
    public void setCostStarttime(Date costStarttime) {
        this.costStarttime = costStarttime;
    }

    /**
     * 获取1-包月 2-套餐  3-计费
     *
     * @return cost_type - 1-包月 2-套餐  3-计费
     */
    public String getCostType() {
        return costType;
    }

    /**
     * 设置1-包月 2-套餐  3-计费
     *
     * @param costType 1-包月 2-套餐  3-计费
     */
    public void setCostType(String costType) {
        this.costType = costType == null ? null : costType.trim();
    }
}