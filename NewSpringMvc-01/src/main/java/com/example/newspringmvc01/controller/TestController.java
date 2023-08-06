package com.example.newspringmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String index() {

        System.out.println("NewSpringMvc-01");

        return "/WEB-INF/views/hello.jsp";
    }
}
