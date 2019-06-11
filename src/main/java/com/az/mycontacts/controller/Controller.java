package com.az.mycontacts.controller;

import com.az.mycontacts.model.entity.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/users")
    public Users getContacts() {
        return null;
    }
}
