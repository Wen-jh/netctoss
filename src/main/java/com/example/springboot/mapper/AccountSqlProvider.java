package com.example.springboot.mapper;

import org.springframework.util.StringUtils;

import java.util.Map;

public class AccountSqlProvider {
    public String selectPage(Map<String,Object> params){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT account_id,account_login_name,account_real_name,account_idcard_no,account_status,`account_birthdate`,`account_last_login_time` FROM account\n" +
                "WHERE 1=1");
        if(!StringUtils.isEmpty(params.get("accountIdcardNo"))){
            sb.append(" AND account_idcard_no=#{accountIdcardNo}");
        }
        if(!StringUtils.isEmpty(params.get("accountRealName"))){
            sb.append(" AND account_real_name=#{accountRealName}");
        }
        if(!StringUtils.isEmpty(params.get("accountLoginName"))){
            sb.append(" AND account_login_name=#{accountLoginName}");
        }
        if(!StringUtils.isEmpty(params.get("accountStatus"))){
            sb.append(" AND account_status=#{accountStatus}");
        }
        return sb.toString();
    }
}
