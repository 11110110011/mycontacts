package com.az.mycontacts.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESSES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Addresses extends BaseEntityIdentifier{

    @Column(name = "COUNTRY", length = 50)
    private String country;

    @Column(name = "CITY", length = 20)
    private String city;

    @Column(name = "STREET", length = 25)
    private String street;

    @Column(name = "HOUSE_NUMBER", length = 5)
    private String houseNumber;

    @Column(name = "APARTMENT", length = 5)
    private String apartment;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONTACT_ID")
    Contact contact;
}
