package com.test.payment_service.model.dto;

import lombok.Data;

@Data
public class ClientDto {

    private Long id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private String birthDate;
    private String email;
    private String phoneNumber;

}
