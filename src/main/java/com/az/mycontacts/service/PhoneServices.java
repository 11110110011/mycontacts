package com.az.mycontacts.service;

import com.az.mycontacts.model.entity.PhoneNumbers;

public interface PhoneServices {

    PhoneNumbers findPhone(Long id);
    PhoneNumbers addPhone(Long id);
    PhoneNumbers updatePhone (Long id);
    PhoneNumbers deletePhone (Long id);
}
