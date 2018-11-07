package com.fastsun.access.service.jpa;

import java.util.List;

import com.fastsun.access.entity.App;
import com.fastsun.access.entity.Developer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AppJpa extends JpaRepository<App, Integer>, JpaSpecificationExecutor<Developer> {
    List<App> findByDevId(Integer devId);
}