package com.toricor.training.controller;

import com.toricor.training.domain.User;
import com.toricor.training.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserMapper usermapper;

    @GetMapping("/all")
    public List<User> all() {
        return usermapper.selectAll();
    }

    @GetMapping("{id}")
    public User select(int id) {
        return usermapper.select(id);
    }
}
