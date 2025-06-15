package com.example.test.controller;

import com.example.test.aop.InvokeLog;
import com.example.test.domain.ResponseResult;
import com.example.test.domain.User;
import com.example.test.resolver.CurrentUserId;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserService userService;

//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/findUserById")
//    @InvokeLog 加了没用，只能在service层和dao层加，因为这两层在spring容器中，但是controller在springmvc容器中，后者是前者子容器，不能使用父容器方法
    //所以controller层用拦截器增强，其余层可用aop增强
    public ResponseResult<User> findUserById(@RequestParam Integer id) {
        System.out.println("hello");
        User user = userService.findUserById(id);
        return ResponseResult.success(user);
    }


//    @RequestMapping("/testRedis")
//    public ResponseResult<String> testRedis(@RequestParam Integer userId) {
//        System.out.println("userId = " + userId);
//        stringRedisTemplate.opsForValue().set("user", String.valueOf(userId));
//        return ResponseResult.success("success");
//    }
}
