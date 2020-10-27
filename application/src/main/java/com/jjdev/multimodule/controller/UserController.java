package com.jjdev.multimodule.controller;

import com.jjdev.multimodule.dto.User;
import com.jjdev.multimodule.service.UserDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDbService userDbService;

    @Autowired
    public UserController(UserDbService userDbService) {
        this.userDbService = userDbService;
    }

    @GetMapping("/users")
    public List<User> getUser() {
        return userDbService.getUsers();
    }
}