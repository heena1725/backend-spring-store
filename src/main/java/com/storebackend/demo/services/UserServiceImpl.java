package com.storebackend.demo.services;

import com.storebackend.demo.dao.UserDao;
import com.storebackend.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public User getUser(String id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> updateUser(User user) {
        userDao.save(user);
        return userDao.findAll();
    }

    @Override
    public List<User> addUser(User user) {
        if(userDao.existsById(user.getUserId()))return userDao.findAll();
        userDao.save(user);
        return userDao.findAll();
    }
}
