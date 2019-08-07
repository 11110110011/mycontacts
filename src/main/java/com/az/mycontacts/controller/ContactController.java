package com.az.mycontacts.controller;

import com.az.mycontacts.model.dto.AddContactDTO;
import com.az.mycontacts.model.dto.ContactDTO;
import com.az.mycontacts.model.dto.PhoneDTO;
import com.az.mycontacts.model.dto.UpdateContactDTO;
import com.az.mycontacts.model.entity.Contact;
import com.az.mycontacts.model.entity.PhoneNumbers;
import com.az.mycontacts.service.ContactService;
import com.az.mycontacts.service.PhoneServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private PhoneServices phoneService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/contacts")
    public List<ContactDTO> getAllContacts(){

        List<Contact> contacts = contactService.getAll();
        List<ContactDTO> contactList = new ArrayList<>();
        for (Contact contact : contacts) {
            List<PhoneNumbers> phones = phoneService.findPhonesByContactId(contact.getId());
            List<PhoneDTO> phoneList =new ArrayList<>();
            for (PhoneNumbers phone: phones) {
                phoneList.add(PhoneDTO.builder()
                .phone(phone.getPhoneNumber())
                .build());
            }
            contactList.add(ContactDTO.builder()
            .name(contact.getName())
            .phones(phoneList)
            .build());
        }
        return contactList;
    }

    @GetMapping("/contacts/{id}")
    public ResponseEntity<ContactDTO> findById(@PathVariable Long id){

        Contact contact = contactService.findById(id);
        List<PhoneNumbers> phones = phoneService.findPhonesByContactId(contact.getId());
        List<PhoneDTO> phoneList =new ArrayList<>();
        for (PhoneNumbers phone: phones) {
            phoneList.add(PhoneDTO.builder()
                    .phone(phone.getPhoneNumber())
                    .build());
        }
        ContactDTO contactDTO = ContactDTO.builder()
                .name(contact.getName())
                .phones(phoneList)
                .build();

        return new ResponseEntity<>(contactDTO, HttpStatus.OK);
    }

    @GetMapping("/phones/{id}")
    public List<PhoneNumbers> getPhonesById(@PathVariable Long id){
        return this.phoneService.findPhonesByContactId(id);
    }

    @PostMapping("/contacts/add")
    public ResponseEntity<AddContactDTO> addContact(@RequestBody AddContactDTO contactDTO){

        contactService.addContact(convertToEntity(contactDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body(contactDTO);
    }

    @PutMapping("/contacts/update/{id}")
    public ResponseEntity<UpdateContactDTO> updateContact(@PathVariable Long id, @RequestBody UpdateContactDTO updateContactDTO){
        contactService.updateContact(id,updateContactDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(updateContactDTO);
    }

    private ContactDTO convertToDto(Contact contact){
        return modelMapper.map(contact, ContactDTO.class);
    }

    private Contact convertToEntity(AddContactDTO contactDTO){
        Contact contact = modelMapper.map(contactDTO, Contact.class);
        return contact;
    }

}
