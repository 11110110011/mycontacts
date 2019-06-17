package com.az.mycontacts.service;

import com.az.mycontacts.model.entity.Contact;

import java.util.List;

public interface ContactServices {

    List<Contact> getAll();
    void addContact(Users user);
    Users updateUser (Long id);
    Users deleteUser (Long id);
}
