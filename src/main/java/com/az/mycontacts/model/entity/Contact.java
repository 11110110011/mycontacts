package com.az.mycontacts.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CONTACTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Builder
public class Contact extends BaseEntityIdentifier {

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PhoneNumbers> phoneNumbers = new ArrayList<>();

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Addresses> addresses = new ArrayList<>();
}

