package com.example.springboot.mapper;

import org.springframework.util.StringUtils;

import java.util.Map;

public class BillSqlProvider {
    public String selectPage(Map<String,Object> params){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT b.`bill_id`,b.`bill_month`,b.`bill_cost`,b.`pay_mode`,b.`pay_state`,a.`account_real_name`,a.`account_idcard_no`,a.`account_login_name` FROM bill b    " +
                "LEFT JOIN account a   " +
                "ON b.account_id=a.`account_id`    " +
                "WHERE 1=1");
        if(!StringUtils.isEmpty(params.get("accountIdcardNo"))){
            sb.append(" AND a.`account_idcard_no`=#{accountIdcardNo}");
        }
        if(!StringUtils.isEmpty(params.get("accountLoginName"))){
            sb.append(" AND a.`account_login_name`=#{accountLoginName}");
        }
        if(!StringUtils.isEmpty(params.get("accountRealName"))){
            sb.append(" AND a.`account_real_name`=#{accountRealName}");
        }
        if(!StringUtils.isEmpty(params.get("billMonth"))){
            sb.append(" AND b.`bill_month`=#{billMonth}");
        }
        return sb.toString();
    }
}
