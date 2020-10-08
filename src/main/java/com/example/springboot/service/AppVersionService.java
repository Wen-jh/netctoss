package com.example.springboot.service;

import com.example.springboot.entity.AppVersion;
import com.github.pagehelper.PageInfo;

public interface AppVersionService  {
    PageInfo<AppVersion> selectAll();
}
