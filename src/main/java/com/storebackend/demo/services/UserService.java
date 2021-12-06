package com.storebackend.demo.services;

import com.storebackend.demo.entities.User;

import java.util.List;

public interface UserService {

    User getUser(String id);

    List<User> updateUser(User user);
}
