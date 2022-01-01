package com.itheima.microservice.service1.server;

import co.itheima.microservice.service1.api.ConsumerService;
import com.itheima.microservice.service2.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    //注入dubbo
    @Reference
    private ProviderService providerService;

    @Override
    public String service() {
        String service = providerService.service();
        return "consumer invoker--"+service;
    }
}
