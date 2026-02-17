package com.revshop_backend.revshop_testing.service;

import com.revshop_backend.revshop_testing.model.User;
import com.revshop_backend.revshop_testing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }


}

