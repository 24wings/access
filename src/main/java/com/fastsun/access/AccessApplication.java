package com.fastsun.access;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EnableEurekaClient
// @EnableDiscoveryClient
@EnableJpaRepositories("com.fastsun")
@ComponentScan(basePackages = { "com.fastsun.access", "com.fastsun.access.service.*" })
@EntityScan(basePackages = { "com.fastsun.access.entity" })
// @RestController
public class AccessApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessApplication.class, args);
    }

}
