package com.example.newspringmvc03.controller;

import com.example.newspringmvc03.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/")
    public String test01() {

        String msg = testService.sayHello();
        System.out.println(msg);

        return "hello";
    }
}
