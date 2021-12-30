package com.itheima.nacos.controller;

import com.itheima.nacos.client.ConsumerProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerProviderClient consumerProviderClient;

    @GetMapping("/yuan")
    public String getYuan(){
        return consumerProviderClient.getService();
    }
}
