package com.atguigu.springcloud.alibaba.service;

import com.yy.cloud.common.entities.CommonResult;
import com.yy.cloud.common.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Integer id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
