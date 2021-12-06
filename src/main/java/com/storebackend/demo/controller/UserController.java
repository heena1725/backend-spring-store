package com.storebackend.demo.controller;

import com.storebackend.demo.entities.User;
import com.storebackend.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @PutMapping("/user")
    public List<User> updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
