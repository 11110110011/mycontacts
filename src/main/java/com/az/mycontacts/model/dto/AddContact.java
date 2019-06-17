package com.az.mycontacts.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class AddContact {

    private String name;
    private String email;
    private List<Address> address;
    private List<Phone> phones;

}
