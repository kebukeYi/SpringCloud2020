package com.yy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 19327
 * @create 2020-02-19 19:00
 */
@Configuration
public class MySelfRule {

    /*
     *Ribbon  负载均衡算法
     */

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }

}
