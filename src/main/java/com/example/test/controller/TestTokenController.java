package com.example.test.controller;

import com.example.test.domain.ResponseResult;
import com.example.test.domain.User;
import com.example.test.resolver.CurrentUserId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TestTokenController {
    //测试参数解析，前端必须传入token，因为有拦截器，UserIdArgumentResolver中jwt转换成userId，传入下面接口的userId参数
    @RequestMapping("/testParam")
    public ResponseResult<User> testParam(@CurrentUserId String userId) {
        System.out.println("userId = " + userId);
        return ResponseResult.success();
    }
}
