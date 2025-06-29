package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestGitController {
    /**
     * 访问 testIndex.html 页面
     * @return 视图名，对应 testIndex.html
     */
    @GetMapping("/index")
    public String showTestIndexPage() {
        System.out.println("访问 testIndex.html 页面");
        return "testIndex.html";
    }
}
