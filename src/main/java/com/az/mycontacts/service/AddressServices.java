package com.az.mycontacts.service;

import com.az.mycontacts.model.entity.Addresses;

public interface AddressServices {

    Addresses findAddress(Long id);
    Addresses addAddress(Long id);
    Addresses updateAddress (Long id);
    Addresses deleteAddress (Long id);
}
