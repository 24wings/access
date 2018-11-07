package com.fastsun.access.service.jpa;

import com.fastsun.access.entity.Developer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeveloperJpa extends JpaRepository<Developer, Integer>, JpaSpecificationExecutor<Developer> {
    Developer findTop1ByUsername(String username);
}