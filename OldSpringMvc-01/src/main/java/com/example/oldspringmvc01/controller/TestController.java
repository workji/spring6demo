package com.example.oldspringmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test01")
    public String test01() {
        System.out.println("old springmvc hello");
        return "/WEB-INF/views/hello.jsp";
    }
}
