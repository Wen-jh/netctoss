package com.example.springboot.entity;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Entity
@Table(name = "privilege")
public class Privilege {
    @Id
    @Column(name = "privilege_id")
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer privilegeId;

    /**
     * 权限名字
     */
    @Column(name = "privilege_name")
    private String privilegeName;

    /**
     * 权限请求url地址
     */
    @Column(name = "private_url")
    private String privateUrl;

    /**
     * @return privilege_id
     */
    public Integer getPrivilegeId() {
        return privilegeId;
    }

    /**
     * @param privilegeId
     */
    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    /**
     * 获取权限名字
     *
     * @return privilege_name - 权限名字
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * 设置权限名字
     *
     * @param privilegeName 权限名字
     */
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    /**
     * 获取权限请求url地址
     *
     * @return private_url - 权限请求url地址
     */
    public String getPrivateUrl() {
        return privateUrl;
    }

    /**
     * 设置权限请求url地址
     *
     * @param privateUrl 权限请求url地址
     */
    public void setPrivateUrl(String privateUrl) {
        this.privateUrl = privateUrl == null ? null : privateUrl.trim();
    }
}