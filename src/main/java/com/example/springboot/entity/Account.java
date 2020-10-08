package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id")
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(name = "account_recommender_id")
    private Integer accountRecommenderId;

    @Column(name = "account_login_name")
    private String accountLoginName;

    @Column(name = "account_login_passwd")
    private String accountLoginPasswd;

    /**
     * 0-开通  1-暂停    2-删除
     */
    @Column(name = "account_status")
    private String accountStatus;

    @Column(name = "account_create_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date accountCreateDate;

    @Column(name = "account_pause_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date accountPauseDate;

    @Column(name = "account_close_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date accountCloseDate;

    @Column(name = "account_real_name")
    private String accountRealName;

    @Column(name = "account_idcard_no")
    private String accountIdcardNo;

    @Column(name = "account_birthdate")
    private Date accountBirthdate;

    @Column(name = "account_gender")
    private String accountGender;

    @Column(name = "account_occupation")
    private String accountOccupation;

    @Column(name = "account_telephone")
    private String accountTelephone;

    @Column(name = "account_email")
    private String accountEmail;

    @Column(name = "account_mail_address")
    private String accountMailAddress;

    @Column(name = "account_zipcode")
    private String accountZipcode;

    @Column(name = "account_qq")
    private String accountQq;

    @Column(name = "account_last_login_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date accountLastLoginTime;

    @Column(name = "account_last_login_ip")
    private String accountLastLoginIp;

    @Column(name = "days")
    @Transient
    private String days;
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
     * @return account_recommender_id
     */
    public Integer getAccountRecommenderId() {
        return accountRecommenderId;
    }

    /**
     * @param accountRecommenderId
     */
    public void setAccountRecommenderId(Integer accountRecommenderId) {
        this.accountRecommenderId = accountRecommenderId;
    }

    /**
     * @return account_login_name
     */
    public String getAccountLoginName() {
        return accountLoginName;
    }

    /**
     * @param accountLoginName
     */
    public void setAccountLoginName(String accountLoginName) {
        this.accountLoginName = accountLoginName == null ? null : accountLoginName.trim();
    }

    /**
     * @return account_login_passwd
     */
    public String getAccountLoginPasswd() {
        return accountLoginPasswd;
    }

    /**
     * @param accountLoginPasswd
     */
    public void setAccountLoginPasswd(String accountLoginPasswd) {
        this.accountLoginPasswd = accountLoginPasswd == null ? null : accountLoginPasswd.trim();
    }

    /**
     * 获取0-开通  1-暂停    2-删除
     *
     * @return account_status - 0-开通  1-暂停    2-删除
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置0-开通  1-暂停    2-删除
     *
     * @param accountStatus 0-开通  1-暂停    2-删除
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus == null ? null : accountStatus.trim();
    }

    /**
     * @return account_create_date
     */
    public Date getAccountCreateDate() {
        return accountCreateDate;
    }

    /**
     * @param accountCreateDate
     */
    public void setAccountCreateDate(Date accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    /**
     * @return account_pause_date
     */
    public Date getAccountPauseDate() {
        return accountPauseDate;
    }

    /**
     * @param accountPauseDate
     */
    public void setAccountPauseDate(Date accountPauseDate) {
        this.accountPauseDate = accountPauseDate;
    }

    /**
     * @return account_close_date
     */
    public Date getAccountCloseDate() {
        return accountCloseDate;
    }

    /**
     * @param accountCloseDate
     */
    public void setAccountCloseDate(Date accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }

    /**
     * @return account_real_name
     */
    public String getAccountRealName() {
        return accountRealName;
    }

    /**
     * @param accountRealName
     */
    public void setAccountRealName(String accountRealName) {
        this.accountRealName = accountRealName == null ? null : accountRealName.trim();
    }

    /**
     * @return account_idcard_no
     */
    public String getAccountIdcardNo() {
        return accountIdcardNo;
    }

    /**
     * @param accountIdcardNo
     */
    public void setAccountIdcardNo(String accountIdcardNo) {
        this.accountIdcardNo = accountIdcardNo == null ? null : accountIdcardNo.trim();
    }

    /**
     * @return account_birthdate
     */
    public Date getAccountBirthdate() {
        return accountBirthdate;
    }

    /**
     * @param accountBirthdate
     */
    public void setAccountBirthdate(Date accountBirthdate) {
        this.accountBirthdate = accountBirthdate;
    }

    /**
     * @return account_gender
     */
    public String getAccountGender() {
        return accountGender;
    }

    /**
     * @param accountGender
     */
    public void setAccountGender(String accountGender) {
        this.accountGender = accountGender == null ? null : accountGender.trim();
    }

    /**
     * @return account_occupation
     */
    public String getAccountOccupation() {
        return accountOccupation;
    }

    /**
     * @param accountOccupation
     */
    public void setAccountOccupation(String accountOccupation) {
        this.accountOccupation = accountOccupation == null ? null : accountOccupation.trim();
    }

    /**
     * @return account_telephone
     */
    public String getAccountTelephone() {
        return accountTelephone;
    }

    /**
     * @param accountTelephone
     */
    public void setAccountTelephone(String accountTelephone) {
        this.accountTelephone = accountTelephone == null ? null : accountTelephone.trim();
    }

    /**
     * @return account_email
     */
    public String getAccountEmail() {
        return accountEmail;
    }

    /**
     * @param accountEmail
     */
    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail == null ? null : accountEmail.trim();
    }

    /**
     * @return account_mail_address
     */
    public String getAccountMailAddress() {
        return accountMailAddress;
    }

    /**
     * @param accountMailAddress
     */
    public void setAccountMailAddress(String accountMailAddress) {
        this.accountMailAddress = accountMailAddress == null ? null : accountMailAddress.trim();
    }

    /**
     * @return account_zipcode
     */
    public String getAccountZipcode() {
        return accountZipcode;
    }

    /**
     * @param accountZipcode
     */
    public void setAccountZipcode(String accountZipcode) {
        this.accountZipcode = accountZipcode == null ? null : accountZipcode.trim();
    }

    /**
     * @return account_qq
     */
    public String getAccountQq() {
        return accountQq;
    }

    /**
     * @param accountQq
     */
    public void setAccountQq(String accountQq) {
        this.accountQq = accountQq == null ? null : accountQq.trim();
    }

    /**
     * @return account_last_login_time
     */
    public Date getAccountLastLoginTime() {
        return accountLastLoginTime;
    }

    /**
     * @param accountLastLoginTime
     */
    public void setAccountLastLoginTime(Date accountLastLoginTime) {
        this.accountLastLoginTime = accountLastLoginTime;
    }

    /**
     * @return account_last_login_ip
     */
    public String getAccountLastLoginIp() {
        return accountLastLoginIp;
    }

    /**
     * @param accountLastLoginIp
     */
    public void setAccountLastLoginIp(String accountLastLoginIp) {
        this.accountLastLoginIp = accountLastLoginIp == null ? null : accountLastLoginIp.trim();
    }
}