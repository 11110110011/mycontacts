package com.az.mycontacts.model.dto;

import lombok.*;

import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Builder
@Data
public class Contact {

    private String fullName;
    private String email;
    private List<Address> address;
    private List<Phone> phones;
}
