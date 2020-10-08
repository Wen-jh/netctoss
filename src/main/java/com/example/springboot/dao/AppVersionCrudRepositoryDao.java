package com.example.springboot.dao;

import com.example.springboot.entity.AppVersion;
import org.springframework.data.repository.CrudRepository;

public interface    AppVersionCrudRepositoryDao extends CrudRepository<AppVersion,Long> {
}
