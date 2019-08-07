package com.az.mycontacts.service;

import com.az.mycontacts.model.entity.PhoneNumbers;

import java.util.List;

public interface PhoneServices {

    List<PhoneNumbers> findPhonesByContactId(Long contactId);
    void addPhone(Long id, String phone);
    PhoneNumbers updatePhone (Long id);
    PhoneNumbers deletePhone (Long id);
}
