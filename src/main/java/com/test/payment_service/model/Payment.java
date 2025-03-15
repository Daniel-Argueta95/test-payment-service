package com.test.payment_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {

    private Long id;
    private Long orderId;
    private String date;
    private Double totalAmount;

}
