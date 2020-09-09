package com.yy.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 19327
 * @create 2020-02-18 17:27
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced//完成自定义负载均衡调用
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}