package com.storebackend.demo.services;

import com.storebackend.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    List<User> list;

    @Override
    public User getUser(String id) {
        for (User user : list) {
            if (Objects.equals(user.getUserId(), id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> updateUser(User user) {
        list = list.stream().peek(ele -> {
            if (ele.getUserId().equals(user.getUserId())) {
                ele.setTotalMoney(user.getTotalMoney());
            }
        }).collect(Collectors.toList());
        return list;
    }
}
