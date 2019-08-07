package com.az.mycontacts.service.implementation;

import com.az.mycontacts.model.dto.UpdateContactDTO;
import com.az.mycontacts.model.entity.Contact;
import com.az.mycontacts.repository.ContactRepository;
import com.az.mycontacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Autowired
    ContactServiceImpl(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contact findById(Long id) {

        Contact contact = contactRepository.findById(id).orElseThrow(()-> new NoSuchElementException("id"));
        return contact;
    }

    @Override
    public void addContact(Contact contact) {

        Contact n = new Contact();
        n.setName(contact.getName());
        n.setEmail(contact.getEmail());
        n.setCreatedOn(LocalDateTime.now());
        contactRepository.save(n);
    }

    @Override
    public void updateContact(Long id, UpdateContactDTO contactDTO) {
        Contact contact = contactRepository.findById(id).orElseThrow(()-> new NoSuchElementException("id"));
        contact.setName(contactDTO.getName());
        contact.setEmail(contactDTO.getEmail());
        contactRepository.save(contact);
    }

    @Override
    public Contact deleteUser(Long id) {
        return null;
    }


}
