package com.az.mycontacts.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@ToString
public abstract class BaseEntityIdentifier {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

}
