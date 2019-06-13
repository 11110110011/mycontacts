package com.az.mycontacts.model.dto;

import lombok.Data;


@Data
public class User {

    private String fullName;
    private String email;
    private Address address;
    private Phones phones;
}
