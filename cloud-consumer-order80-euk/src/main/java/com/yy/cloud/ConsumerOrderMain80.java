package com.yy.cloud;

import com.yy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author : mmy
 * @Creat Time : 2020/8/29  下午 9:00
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
//访问 CLOUD-PAYMENT-SERVICE  这个服务  当存在两个以上 服务时，采用 自定义 随机 规则
public class ConsumerOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain80.class, args);
    }
}
