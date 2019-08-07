package com.az.mycontacts.service;

import com.az.mycontacts.model.dto.UpdateContactDTO;
import com.az.mycontacts.model.entity.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAll();
    void addContact(Contact contact);
    Contact findById(Long id);
    void updateContact (Long id, UpdateContactDTO contactDTO);
    Contact deleteUser (Long id);
}
