package com.example.springboot.mapper;

import com.example.springboot.entity.Service;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface ServiceMapper extends Mapper<Service> {

    @SelectProvider(type = ServiceSqlProvider.class,method = "selectPage")
    List<Service> selectPage(Map<String, Object> params);

    @Select("SELECT s.`unix_host`,s.`os_username`,a.`account_idcard_no`,a.`account_real_name`,DATEDIFF(CURDATE(),account_create_date) days   " +
            "FROM service s LEFT JOIN account a   " +
            "ON s.`account_id`=a.`account_id`")
    List<Service> selectUnix();

    @Select("SELECT s.`unix_host`,c.`cost_name`,c.`cost_base_duration`,c.`cost_creattime` FROM service s LEFT JOIN cost c  " +
            "ON s.`cost_id`=c.`cost_id`")
    List<Service> selectBill();
    @Select("SELECT s.`service_id`,a.`account_login_name`,a.`account_id`,a.`account_real_name`,a.`account_idcard_no`,s.`unix_host`,s.`os_username`,s.`service_status`,s.`cost_id`,s.`service_create_date`,c.`cost_name`,c.`cost_descr` " +
            "FROM service s LEFT JOIN account a " +
            "ON s.`account_id`=a.`account_id` " +
            "LEFT JOIN cost c " +
            "ON s.`cost_id`=c.`cost_id` " +
            "WHERE s.`service_id`=#{id}")
    Service selectServiceById(Integer id);
}