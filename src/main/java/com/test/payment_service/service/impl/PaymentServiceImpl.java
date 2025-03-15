package com.test.payment_service.service.impl;

import com.test.payment_service.model.Payment;
import com.test.payment_service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public List<Payment> getAll() {
         return Arrays.asList(new Payment(1L,1L,new Date().toString(),
                 777.77), new Payment(1L,1L,new Date().toString(),11.11)
         );
    }

    @Override
    public Payment single(Long id) {
        return new Payment(1L,1L,new Date().toString(),
                777.77);
    }

    @Override
    public Payment addOrUpdate(Payment payment) {
        return new Payment(payment.getId(),payment.getOrderId(),payment.getDate(),
                payment.getTotalAmount());
    }

    @Override
    public void remove(Long id) {
        log.info("Payment removed");
    }
}
