package com.test.payment_service.model.dto;

import lombok.Data;

@Data
public class OrderDetailDto {

    private Long id;
    private Long orderId;
    private Long productId;
}
