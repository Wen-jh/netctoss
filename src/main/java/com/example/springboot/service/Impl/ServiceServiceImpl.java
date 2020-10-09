package com.example.springboot.service.Impl;

import com.example.springboot.entity.Account;
import com.example.springboot.mapper.ServiceMapper;
import com.example.springboot.service.ServiceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    ServiceMapper serviceMapper;

    @Override
    public void setState(Integer id) {
        com.example.springboot.entity.Service service = new com.example.springboot.entity.Service();
        service.setAccountId(id);
        service.setAccountStatus("0");
        serviceMapper.updateByPrimaryKeySelective(service);
    }

    @Override
    public com.example.springboot.entity.Service selectOne(Integer id) {
        return serviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public com.example.springboot.entity.Service selectServiceById(Integer id) {
        return serviceMapper.selectServiceById(id);
    }

    @Override
    public PageInfo<com.example.springboot.entity.Service> selectBill(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<com.example.springboot.entity.Service> services = serviceMapper.selectBill();
        return new PageInfo<>(services);
    }

    @Override
    public PageInfo<com.example.springboot.entity.Service> selectUnix(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<com.example.springboot.entity.Service> services = serviceMapper.selectUnix();
        return new PageInfo<>(services);
    }

    @Override
    public PageInfo<com.example.springboot.entity.Service> selectPage(int pageNum, int pageSize, Map<String, Object> params) {
        PageHelper.startPage(pageNum,pageSize);
        List<com.example.springboot.entity.Service> services = serviceMapper.selectPage(params);
        return new PageInfo<>(services);
    }
}
