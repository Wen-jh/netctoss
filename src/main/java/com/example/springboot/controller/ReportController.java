package com.example.springboot.controller;

import com.example.springboot.entity.Result;
import com.example.springboot.service.AccountService;
import com.example.springboot.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("report")
public class ReportController {

    @Autowired
    AccountService accountService;

    @Autowired
    ServiceService serviceService;
    @RequestMapping("selectPage/{pageNum}/{pageSize}")
    @ResponseBody
    public Result selectPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return new Result(true,"查询成功",accountService.selectReportList(pageNum,pageSize));
    }
    @RequestMapping("selectUnix/{pageNum}/{pageSize}")
    @ResponseBody
    public Result selectUnix(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return new Result(true,"查询成功",serviceService.selectUnix(pageNum,pageSize));
    }
    @RequestMapping("selectBill/{pageNum}/{pageSize}")
    @ResponseBody
    public Result selectBill(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return new Result(true,"查询成功",serviceService.selectBill(pageNum,pageSize));
    }
}
