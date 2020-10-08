package com.example.springboot.service;

import com.example.springboot.entity.Bill;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface BillService {
    PageInfo<Bill> selectPage(int pageNum, int pageSize, Map<String, Object> params);
}
