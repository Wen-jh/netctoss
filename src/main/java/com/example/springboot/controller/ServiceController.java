package com.example.springboot.controller;

import com.example.springboot.entity.Result;
import com.example.springboot.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @RequestMapping("selectPage/{pageNum}/{pageSize}")
    @ResponseBody
    public Result selectPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, Map<String,Object> params){
        return new Result(true,"查询成功",serviceService.selectPage(pageNum,pageSize,params));
    }
    @RequestMapping("toServiceModi")
    public ModelAndView toServiceModi(){
        return new ModelAndView("/service/service_modi.html");
    }
    @RequestMapping("selectOne/{id}")
    @ResponseBody
    public Result selectOne(@PathVariable("id") Integer id){
        return new Result(true,"查询成功",serviceService.selectOne(id));
    }
    @RequestMapping("setState/{id}")
    @ResponseBody
    public Result setState(@PathVariable("id") Integer id){
        serviceService.setState(id);
        return new Result(true,"修改成功",null);
    }
}
