package com.example.springboot.mapper;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.Map;

public class ServiceSqlProvider {

    public String selectPage(Map<String,Object> params){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT s.`service_id`,s.`os_username`,s.`unix_host`,a.`account_id`,a.`account_real_name`,a.`account_idcard_no`,a.`account_status`,c.`cost_descr`,c.`cost_base_duration` FROM service s  " +
                "LEFT JOIN `account` a  " +
                "ON s.`account_id`=a.`account_id`  " +
                "LEFT JOIN `cost` c " +
                "ON s.`cost_id`=c.`cost_id` " +
                "WHERE s.`service_status`=0");
        if(!StringUtils.isEmpty(params.get("osUsername"))){
            sb.append("AND s.`os_username` LIKE CONCAT('%',#{osUsername},'%')");
        }
        if(!StringUtils.isEmpty(params.get("unixHost"))){
            sb.append("AND s.`unix_host`=#{unixHost}");
        }
        if(!StringUtils.isEmpty(params.get("accountIdcardNo"))){
            sb.append("AND a.`account_idcard_no`=#{accountIdcardNo}");
        }
        if(!StringUtils.isEmpty(params.get("accountStatus"))){
            sb.append("AND a.`account_status`=#{accountStatus}");
        }
        return sb.toString();
    }

}
