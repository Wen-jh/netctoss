package com.example.springboot.mapper;


import com.example.springboot.entity.AppVersion;
import tk.mybatis.mapper.common.Mapper;

//springboot 只能扫描到带有Mapper注解的  生成代理子类
@org.apache.ibatis.annotations.Mapper
public interface AppVersionMapper extends Mapper<AppVersion> {

}
