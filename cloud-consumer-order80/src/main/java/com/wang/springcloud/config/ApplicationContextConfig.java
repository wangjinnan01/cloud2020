package com.wang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 王晋南
 * @Date 2020/06/17 16:36
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //赋予RestTemplate负载均衡的能力
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
