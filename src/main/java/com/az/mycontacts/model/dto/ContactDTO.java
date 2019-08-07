package com.az.mycontacts.model.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ContactDTO {

    private String name;
    private List<PhoneDTO> phones;
}
