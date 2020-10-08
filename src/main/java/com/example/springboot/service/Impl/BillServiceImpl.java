package com.example.springboot.service.Impl;

import com.example.springboot.entity.Bill;
import com.example.springboot.mapper.BillMapper;
import com.example.springboot.service.BillService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    BillMapper billMapper;
    @Override
    public PageInfo<Bill> selectPage(int pageNum, int pageSize, Map<String, Object> params) {
        PageHelper.startPage(pageNum,pageSize);
        List<Bill> bills = billMapper.selectPage(params);
        return new PageInfo<>(bills);
    }
}
