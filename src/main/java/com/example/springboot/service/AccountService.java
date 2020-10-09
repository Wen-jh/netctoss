package com.example.springboot.service;

import com.example.springboot.entity.Account;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface AccountService {
    PageInfo<Account> selectPage(int pageNum, int pageSize, Map<String, Object> params);

    PageInfo<Account> selectReportList(int pageNum, int pageSize);

    void setState(Integer id);

    Account selectOne(Integer id);

    Account selectAccountById(Integer id);
}
