package com.itheima.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/service")
    public String getService(){
        System.out.println("生产者");
        return "provider invoke";
    }
}
