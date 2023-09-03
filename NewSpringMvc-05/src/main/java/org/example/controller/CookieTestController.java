package org.example.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cookie")
public class CookieTestController {

    @RequestMapping("/data1")
    public String data1(@CookieValue(value = "cookiename") String name) {
        return name;
    }


    @GetMapping("/data1/save")
    public String data1Save(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookiename", "1111111111");
        response.addCookie(cookie);
        return "ok";
    }
}
