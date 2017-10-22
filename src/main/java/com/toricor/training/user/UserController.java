package com.toricor.training.user;

import com.toricor.training.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @PostMapping("/insert")
    public void postUser(User user) {
        userService.insert(user);
    }
}
