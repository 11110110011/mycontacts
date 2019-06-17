package com.az.mycontacts.model.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Address {

    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private String apartment;

}
