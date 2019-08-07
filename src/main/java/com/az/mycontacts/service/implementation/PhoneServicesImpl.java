package com.az.mycontacts.service.implementation;

import com.az.mycontacts.model.entity.PhoneNumbers;
import com.az.mycontacts.repository.PhoneNumRepository;
import com.az.mycontacts.service.PhoneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PhoneServicesImpl implements PhoneServices {


    private PhoneNumRepository phoneNumRepository;

    @Autowired
    PhoneServicesImpl(PhoneNumRepository phoneNumRepository){
        this.phoneNumRepository = phoneNumRepository;
    }


    @Override
    public List<PhoneNumbers> findPhonesByContactId(Long contactId) {
        List<PhoneNumbers> phones = phoneNumRepository.findPhoneNumbersByContact_Id(contactId);

//        List<PhoneNumbers> phones = phoneNumRepository.findPhoneNumbersByContact_Id(contactId);
        return phones;
    }

    @Override
    public void addPhone(Long id, String phone) {

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
