package com.az.mycontacts.model.dto;

import lombok.Data;


@Data
public class Address {

    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private String apartment;

}
