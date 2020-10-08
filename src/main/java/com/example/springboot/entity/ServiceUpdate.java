package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "service_update")
public class ServiceUpdate {
    @Id
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "service_id")
    private Integer serviceId;

    @Column(name = "unix_host")
    private String unixHost;

    @Column(name = "os_username")
    private String osUsername;

    @Column(name = "cost_id")
    private Integer costId;

    @Column(name = "service_create_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CTT")
    private Date serviceCreateDate;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
}