package com.itheima.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider") //指定要调用的服务名称
public interface ConsumerProviderClient {

    @GetMapping("/service")
    public String getService(); //指定要调用的具体接口
}
