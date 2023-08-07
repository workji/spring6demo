package com.example.newspringmvc04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String test01(Model m) {

        System.out.println("NewSpringMvc04 hello");

        m.addAttribute("msg", "Hello SpringMVC!");
        return "hello";
    }
}
