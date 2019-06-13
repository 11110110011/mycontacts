package com.az.mycontacts.service;

import com.az.mycontacts.model.entity.Users;

public interface UserServices {

    Users findAll();
    Users addUser(Users user);
    Users updateUser (Long id);
    Users deleteUser (Long id);
}
