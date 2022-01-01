package com.itheima.microservice.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBootstrap.class,args);
    }
}
