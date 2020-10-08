package com.example.springboot.service.Impl;

import com.example.springboot.entity.Account;
import com.example.springboot.mapper.AccountMapper;
import com.example.springboot.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account selectOne(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    public void setState(Integer id) {
        Account account = new Account();
        account.setAccountId(id);
        account.setAccountStatus("1");
        accountMapper.updateByPrimaryKeySelective(account);
    }

    @Override
    public PageInfo<Account> selectReportList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accounts = accountMapper.selectReportList();
        return new PageInfo<>(accounts);
    }

    @Override
    public PageInfo<Account> selectPage(int pageNum, int pageSize, Map<String, Object> params) {
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accounts = accountMapper.selectPage(params);
        return new PageInfo<>(accounts);
    }
}
