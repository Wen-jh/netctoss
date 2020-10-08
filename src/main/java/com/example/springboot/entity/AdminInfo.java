package com.example.springboot.entity;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "admin_info")
public class AdminInfo {
    @Id
    @Column(name = "admin_id")
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;

    @Column(name = "admin_code")
    private String adminCode;

    @Column(name = "admin_password")
    private String adminPassword;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "admin_telephone")
    private String adminTelephone;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_enrolldate")
    private Date adminEnrolldate;

    /**
     * @return admin_id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * @return admin_code
     */
    public String getAdminCode() {
        return adminCode;
    }

    /**
     * @param adminCode
     */
    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode == null ? null : adminCode.trim();
    }

    /**
     * @return admin_password
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * @return admin_name
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * @return admin_telephone
     */
    public String getAdminTelephone() {
        return adminTelephone;
    }

    /**
     * @param adminTelephone
     */
    public void setAdminTelephone(String adminTelephone) {
        this.adminTelephone = adminTelephone == null ? null : adminTelephone.trim();
    }

    /**
     * @return admin_email
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * @param adminEmail
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    /**
     * @return admin_enrolldate
     */
    public Date getAdminEnrolldate() {
        return adminEnrolldate;
    }

    /**
     * @param adminEnrolldate
     */
    public void setAdminEnrolldate(Date adminEnrolldate) {
        this.adminEnrolldate = adminEnrolldate;
    }
}