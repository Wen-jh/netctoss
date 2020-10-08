package com.example.springboot.controller;

import com.example.springboot.entity.Account;
import com.example.springboot.entity.Result;
import com.example.springboot.service.AccountService;
import com.example.springboot.service.AppVersionService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
@RequestMapping("account")
public class AccountController {


    @Autowired
    AccountService accountService;
    @RequestMapping("selectPage/{pageNum}/{pageSize}")
    @ResponseBody
    public Result selectPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, @RequestParam Map<String,Object> params){
        return new Result(true,"查询成功",accountService.selectPage(pageNum,pageSize,params));
    }

    @RequestMapping("setState/{id}")
    @ResponseBody
    public Result setState(@PathVariable("id") Integer id){
        accountService.setState(id);
        return new Result(true,"修改成功",null);
    }
    @RequestMapping("toAccountModi")
    public ModelAndView toAccountModi(){
        return new ModelAndView("/account/account_modi.html");
    }
    @RequestMapping("selectOne/{id}")
    @ResponseBody
    public Result selectOne(@PathVariable("id") Integer id){
        return new Result(true,"查询成功",accountService.selectOne(id));
    }
}
