package com.az.mycontacts.repository;

import com.az.mycontacts.model.entity.PhoneNumbers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface PhoneNumRepository extends JpaRepository<PhoneNumbers, Long> {
    List<PhoneNumbers> findPhoneNumbersByContact_Id(Long contactId);
//    PhoneNumbers findPhoneNumbersById(Long id);
}
