package com.az.mycontacts.service.implementation;

import com.az.mycontacts.model.entity.PhoneNumbers;
import com.az.mycontacts.repository.PhoneNumRepository;
import com.az.mycontacts.service.PhoneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhoneServicesImpl implements PhoneServices {

    private PhoneNumRepository numRepository;

    @Autowired
    PhoneServicesImpl(PhoneNumRepository numRepository){
        this.numRepository = numRepository;
    }

    @Override
    public PhoneNumbers findPhone(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void addPhone(Long id, String phone) {

//        numRepository.save("12345")
    }

    @Override
    public PhoneNumbers updatePhone(Long id) {
        return null;
    }

    @Override
    public PhoneNumbers deletePhone(Long id) {
        return null;
    }
}
