package com.az.mycontacts.service.implementation;

import com.az.mycontacts.model.entity.Contact;
import com.az.mycontacts.repository.ContactRepository;
import com.az.mycontacts.repository.UsersRepository;
import com.az.mycontacts.service.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactServicesImpl implements ContactServices {

    private ContactRepository contactRepository;

    @Autowired
    ContactServicesImpl(UsersRepository usersRepository){
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAll() {

        return contactRepository.findAll();
    }

    @Override
    @Transactional
    public void addContact(Users user) {

        user = Users.builder()
                .fullName(user.getFullName())
                .email(user.getEmail())
                .addresses(user.getAddresses())
                .phoneNumbers(user.getPhoneNumbers())
                .build();

//        usersRepository.save(user);
    }


    @Override
    public Users updateUser(Long id) {
        return null;
    }

    @Override
    public Users deleteUser(Long id) {
        return null;
    }
}
