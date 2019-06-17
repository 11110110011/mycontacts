package com.az.mycontacts.service;

import com.az.mycontacts.model.entity.PhoneNumbers;

public interface PhoneServices {

    PhoneNumbers findPhone(Long id);
    void addPhone(Long id, String phone);
    PhoneNumbers updatePhone (Long id);
    PhoneNumbers deletePhone (Long id);
}
