package com.az.mycontacts.model.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddContactDTO {

    private String name;
    private String email;

}
