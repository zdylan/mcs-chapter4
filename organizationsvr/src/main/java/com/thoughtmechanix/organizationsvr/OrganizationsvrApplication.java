package com.thoughtmechanix.organizationsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrganizationsvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationsvrApplication.class, args);
    }
}
