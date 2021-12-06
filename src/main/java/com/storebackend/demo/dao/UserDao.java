package com.storebackend.demo.dao;

import com.storebackend.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {

}
