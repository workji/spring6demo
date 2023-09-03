package org.example.controller;

import org.example.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonTestController {


    /**
     * 1. add jackson-databind to pom.xml
     * 2. add json converter to handlerAdapter
     *
     * @param user
     * @return
     */
    @RequestMapping("/data1")
    public String data1(@RequestBody UserEntity user) {
        return user.toString();
    }
}
