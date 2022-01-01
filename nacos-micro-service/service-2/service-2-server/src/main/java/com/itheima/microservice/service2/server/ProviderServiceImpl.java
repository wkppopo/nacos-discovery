package com.itheima.microservice.service2.server;

import com.itheima.microservice.service2.ProviderService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String service() {
        return "provider invoker";
    }
}
