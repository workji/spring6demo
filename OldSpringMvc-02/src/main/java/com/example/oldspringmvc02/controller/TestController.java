package com.example.oldspringmvc02.controller;

import com.example.oldspringmvc02.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test01")
    public String test01() {

        String msg = testService.sayHello();
        System.out.println(msg);

        return "/WEB-INF/views/hello.jsp";

    }
}
