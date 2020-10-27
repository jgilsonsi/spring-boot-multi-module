package com.jjdev.multimodule.service;

import com.jjdev.multimodule.dto.User;
import com.jjdev.multimodule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDbService {

    private final UserRepository userRepository;

    @Autowired
    public UserDbService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAllUsers();
    }
}
