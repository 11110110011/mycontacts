package com.az.mycontacts.model.entity;

import com.az.mycontacts.model.dto.AddContact;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Contact extends BaseEntityIdentifier {

public Contact(AddContact contact){
    this.getName();
}
    private String name;
    private String email;
}

