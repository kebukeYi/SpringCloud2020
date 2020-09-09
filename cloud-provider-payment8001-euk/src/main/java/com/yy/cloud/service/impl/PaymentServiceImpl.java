package com.yy.cloud.service.impl;

import com.yy.cloud.common.entities.Payment;
import com.yy.cloud.dao.PaymentDao;
import com.yy.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther yy
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
