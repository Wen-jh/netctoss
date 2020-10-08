package com.example.springboot.service;

import com.example.springboot.entity.Service;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface ServiceService {
    PageInfo<Service> selectPage(int pageNum, int pageSize, Map<String, Object> params);

    PageInfo<Service> selectUnix(int pageNum, int pageSize);

    void setState(Integer id);

    Service selectOne(Integer id);

    PageInfo<Service> selectBill(int pageNum, int pageSize);
}
