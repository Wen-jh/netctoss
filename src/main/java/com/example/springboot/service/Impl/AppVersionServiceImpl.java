package com.example.springboot.service.Impl;

import com.example.springboot.entity.AppVersion;
import com.example.springboot.mapper.AppVersionMapper;
import com.example.springboot.service.AppVersionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppVersionServiceImpl implements AppVersionService {
    @Autowired
    AppVersionMapper mapper;
    @Cacheable(cacheNames = "appCache",key ="'com.example.springboot.service.Impl.AppVersionServiceImpl:selectAll'" )
    @Override
    public PageInfo<AppVersion> selectAll() {
        PageHelper.startPage(1,5);
        List<AppVersion> appVersions = mapper.selectAll();
        PageInfo<AppVersion> versionPageInfo = new PageInfo<>(appVersions);
        return versionPageInfo;
    }
}
