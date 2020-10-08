package com.example.springboot.dao;

import com.example.springboot.entity.AppVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AppVersionDao extends Repository<AppVersion,Long> {
    List<AppVersion> findByAppExplainLike(String appExplain);
 }
