package com.az.mycontacts.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateContactDTO {

    private String name;
    private String email;

}
