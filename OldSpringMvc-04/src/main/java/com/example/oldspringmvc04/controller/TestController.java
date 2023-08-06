package com.example.oldspringmvc04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test01")
    public String test01() {

        System.out.println("OldSpringMvc-04 Hello");

        return "/WEB-INF/views/hello.jsp";
    }
}
