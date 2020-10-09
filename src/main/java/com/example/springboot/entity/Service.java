package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.domain.PageRequest;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "service")
public class Service {
    @Id
    @Column(name = "service_id")
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceId;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "unix_host")
    private String unixHost;

    @Column(name = "os_username")
    private String osUsername;

    @Column(name = "login_passwd")
    private String loginPasswd;

    @Column(name = "service_status")
    private String serviceStatus;

    @Column(name = "service_create_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date serviceCreateDate;

    @Column(name = "service_pause_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date servicePauseDate;

    @Column(name = "service_close_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date serviceCloseDate;

    @Column(name = "cost_id")
    private Integer costId;

    @Column(name = "account_real_name")
    @Transient
    private String accountRealName;

    @Column(name = "account_idcard_no")
    @Transient
    private String accountIdcardNo;

    @Column(name = "account_status")
    @Transient
    private String accountStatus;

    @Column(name = "cost_descr")
    @Transient
    private String costDescr;

    @Column(name = "cost_base_duration")
    @Transient
    private String costBaseDuration;

    @Column(name = "cost_name")
    @Transient
    private String costName;

    @Column(name = "cost_creattime")
    @Transient
    private String costCreatTime;


    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public String getCostCreatTime() {
        return costCreatTime;
    }

    public void setCostCreatTime(String costCreatTime) {
        this.costCreatTime = costCreatTime;
    }

    public String getAccountRealName() {
        return accountRealName;
    }

    public void setAccountRealName(String accountRealName) {
        this.accountRealName = accountRealName;
    }

    public String getAccountIdcardNo() {
        return accountIdcardNo;
    }

    public void setAccountIdcardNo(String accountIdcardNo) {
        this.accountIdcardNo = accountIdcardNo;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getCostDescr() {
        return costDescr;
    }

    public void setCostDescr(String costDescr) {
        this.costDescr = costDescr;
    }

    public String getCostBaseDuration() {
        return costBaseDuration;
    }

    public void setCostBaseDuration(String costBaseDuration) {
        this.costBaseDuration = costBaseDuration;
    }

    /**
     * @return service_id
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId
     */
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
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
     * @return unix_host
     */
    public String getUnixHost() {
        return unixHost;
    }

    /**
     * @param unixHost
     */
    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost == null ? null : unixHost.trim();
    }

    /**
     * @return os_username
     */
    public String getOsUsername() {
        return osUsername;
    }

    /**
     * @param osUsername
     */
    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername == null ? null : osUsername.trim();
    }

    /**
     * @return login_passwd
     */
    public String getLoginPasswd() {
        return loginPasswd;
    }

    /**
     * @param loginPasswd
     */
    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd == null ? null : loginPasswd.trim();
    }

    /**
     * @return service_status
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * @param serviceStatus
     */
    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus == null ? null : serviceStatus.trim();
    }

    /**
     * @return service_create_date
     */
    public Date getServiceCreateDate() {
        return serviceCreateDate;
    }

    /**
     * @param serviceCreateDate
     */
    public void setServiceCreateDate(Date serviceCreateDate) {
        this.serviceCreateDate = serviceCreateDate;
    }

    /**
     * @return service_pause_date
     */
    public Date getServicePauseDate() {
        return servicePauseDate;
    }

    /**
     * @param servicePauseDate
     */
    public void setServicePauseDate(Date servicePauseDate) {
        this.servicePauseDate = servicePauseDate;
    }

    /**
     * @return service_close_date
     */
    public Date getServiceCloseDate() {
        return serviceCloseDate;
    }

    /**
     * @param serviceCloseDate
     */
    public void setServiceCloseDate(Date serviceCloseDate) {
        this.serviceCloseDate = serviceCloseDate;
    }

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
}