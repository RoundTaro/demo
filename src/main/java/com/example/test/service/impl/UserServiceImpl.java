package com.example.test.service.impl;

import com.example.test.aop.InvokeLog;
import com.example.test.mapper.UserMapper;
import com.example.test.domain.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @InvokeLog
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
