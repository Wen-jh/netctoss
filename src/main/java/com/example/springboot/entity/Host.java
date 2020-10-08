package com.example.springboot.entity;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

@Entity
@Table(name = "host")
public class Host {
    @Id
    @Column(name = "host_id")
    @KeySql(useGeneratedKeys = true)//设置返回数据库自增主键值
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String hostId;

    @Column(name = "host_name")
    private String hostName;

    @Column(name = "host_location")
    private String hostLocation;

    /**
     * @return host_id
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * @param hostId
     */
    public void setHostId(String hostId) {
        this.hostId = hostId == null ? null : hostId.trim();
    }

    /**
     * @return host_name
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * @param hostName
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * @return host_location
     */
    public String getHostLocation() {
        return hostLocation;
    }

    /**
     * @param hostLocation
     */
    public void setHostLocation(String hostLocation) {
        this.hostLocation = hostLocation == null ? null : hostLocation.trim();
    }
}