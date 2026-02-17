package com.revshop_backend.revshop_testing.controller;

import com.revshop_backend.revshop_testing.model.User;
import com.revshop_backend.revshop_testing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @GetMapping("/hello")
    public String hello() {
        return "User module working!";
    }

    @DeleteMapping("/delete")
    public String deleteUser()
    {
        return "User deleted successfully";
    }




}


