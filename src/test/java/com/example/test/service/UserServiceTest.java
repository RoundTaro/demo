package com.example.test.service;

import com.example.test.domain.User;
import com.example.test.resolver.UserIdArgumentResolver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void findUserById() {
        User user = userService.findUserById(4);
        System.out.println(user);
    }
}