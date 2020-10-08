package com.example.springboot.dao;

import com.example.springboot.entity.AppVersion;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SortingRepositoryDao extends PagingAndSortingRepository<AppVersion,Long> {
    List<AppVersion> findByAppExplainStartingWith(String appExplain, Pageable pageable);
}
