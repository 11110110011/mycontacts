package com.az.mycontacts.repository;

import com.az.mycontacts.model.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<Addresses,Long > {
}
