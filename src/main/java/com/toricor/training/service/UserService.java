package com.toricor.training.service;

import com.toricor.training.repository.UserMapper;
import com.toricor.training.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    List<User> findAll() {
        return userMapper.findAll();
    }

    User findById(int id) {
        return userMapper.findById(id);
    }

    void insert(User user){
        userMapper.insert(user);
    }
}
