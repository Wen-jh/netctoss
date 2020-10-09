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

    @Select("SELECT a.`account_id`,a.`account_real_name`,a.`account_idcard_no`,a.`account_login_name`,a.`account_telephone`,a.`account_recommender_id`,ac.`account_idcard_no`, " +
            "a.`account_status`,a.`account_last_login_time`,a.`account_last_login_ip`,a.`account_birthdate`,a.`account_email`,a.`account_occupation`,a.`account_gender`,a.`account_mail_address` " +
            ",a.`account_zipcode`,a.`account_qq` FROM account a LEFT JOIN account ac  " +
            "ON a.`account_recommender_id`=ac.`account_id` WHERE a.`account_id`=#{id}")
    Account selectAccountById(Integer id);
}