package com.example.springboot.mapper;

import com.example.springboot.entity.Account;
import com.example.springboot.entity.Bill;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface BillMapper extends Mapper<Bill> {

    @SelectProvider(type = BillSqlProvider.class,method = "selectPage")
    List<Bill> selectPage(Map<String, Object> params);
}