package com.itheima.microservice.application1.controller;

import co.itheima.microservice.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
public class ApplicationController {

    //注入dubbo 接口
    @Reference
    ConsumerService consumerService; //引用这个服务提供者的接口

    @GetMapping("/service")
    public String service(){
        String service = consumerService.service();
        return "test--"+service;
    }
}
