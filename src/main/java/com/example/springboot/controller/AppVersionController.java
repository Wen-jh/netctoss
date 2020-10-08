package com.example.springboot.controller;

import com.example.springboot.entity.AppVersion;
import com.example.springboot.service.AppVersionService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppVersionController {

    @Autowired
    AppVersionService appVersionService;
    @RequestMapping("selectAll")
    @ResponseBody
    public PageInfo<AppVersion> selectAll(){
        return appVersionService.selectAll();
    }
}
