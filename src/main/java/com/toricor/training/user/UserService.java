package com.toricor.training.user;

import com.toricor.training.user.entity.User;
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
