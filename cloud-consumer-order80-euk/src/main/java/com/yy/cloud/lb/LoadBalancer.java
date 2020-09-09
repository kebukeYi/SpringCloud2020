package com.yy.cloud.lb;


import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther yy
 * @create 2020-02-19 20:31
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
