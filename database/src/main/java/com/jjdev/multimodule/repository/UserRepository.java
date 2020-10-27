package com.jjdev.multimodule.repository;

import com.jjdev.multimodule.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//Class used to simulate a repository
@Repository
public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        users.add(User.builder().id(1L).name("Maria").build());
        users.add(User.builder().id(2L).name("Jose").build());
    }

    public List<User> findAllUsers() {
        return users;
    }
}
