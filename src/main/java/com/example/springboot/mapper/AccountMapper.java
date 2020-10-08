package com.example.springboot.mapper;

import com.example.springboot.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface AccountMapper extends Mapper<Account> {


    @SelectProvider(type = AccountSqlProvider.class,method = "selectPage")
    List<Account> selectPage(Map<String, Object> params);

    @Select("SELECT account_id,account_login_name,account_real_name,account_idcard_no,account_telephone,account_create_date,DATEDIFF(CURDATE(),account_create_date) days " +
            "FROM account")
    List<Account> selectReportList();


}