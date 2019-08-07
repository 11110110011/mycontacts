package com.az.mycontacts.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PHONE_NUMBERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Builder
public class PhoneNumbers extends BaseEntityIdentifier{

    @Column(name = "PHONE_NO")
    private String phoneNumber;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTACT_ID")
    Contact contact;

}
