package com.example.springboot.controller;

import com.example.springboot.entity.Result;
import com.example.springboot.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("bill")
public class BillController {

    @Autowired
    BillService billService;

    @RequestMapping("selectPage/{pageNum}/{pageSize}")
    @ResponseBody
    public Result selectPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, @RequestParam Map<String,Object> params){
        return new Result(true,"查询成功",billService.selectPage(pageNum,pageSize,params));
    }

}
