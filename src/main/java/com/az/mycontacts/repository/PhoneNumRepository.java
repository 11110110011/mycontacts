package com.az.mycontacts.repository;

import com.az.mycontacts.model.entity.PhoneNumbers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumRepository extends JpaRepository<PhoneNumbers, Long> {
}
