package com.test.payment_service.service;

import com.test.payment_service.model.Payment;

import java.util.List;

public interface PaymentService {

    public List<Payment> getAll();
    public Payment single(Long id);
    public Payment addOrUpdate(Payment payment);
    public void remove(Long id);


}
