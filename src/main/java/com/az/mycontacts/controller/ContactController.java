package com.az.mycontacts.controller;

import com.az.mycontacts.model.entity.Contact;
import com.az.mycontacts.service.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactServices contactServices;

    @GetMapping("/users")
    /*public List<Contact> getUsers() {

        List<Phone> phones = new ArrayList<>();
        phones.add(Phone.builder()
        .phone("12345")
        .build());

        phones.add(Phone.builder()
        .phone("54321")
        .build());

        List<Contact> users = new ArrayList<>();
        users.add(Contact.builder()
        .fullName("AAA")
        .email("bbb")
        .phones(phones)
        .build());

        users.add(Contact.builder()
                .fullName("BBB")
                .email("ccc")
                .build());

        return users;
    }*/

    public Optional<List<Contact>> getContacts(){
       return contactServices.getAll();
    }

//    @PostMapping("/users/add")
//    public void addUser(@RequestBody Users user){
//        userServices.addContact(user);
//    }


}
