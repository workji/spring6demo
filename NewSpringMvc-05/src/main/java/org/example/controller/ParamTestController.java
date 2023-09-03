package org.example.controller;

import org.example.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/root")
public class ParamTestController {

    /* get parameter by name             */
    /* /root/data1?name=test1&age=18      */
    @RequestMapping("/data1")
    public String data1(String name, int age) {

        if (name == null) {
            name = "default_name";
        }

        return "name:" + name + " age:" + age;
    }

    /* get parameter by @RequestParam */
    /* /root/data1?account=test&page=1&key2=aaa      */
    @RequestMapping("/data2")
    public String data2(
            @RequestParam(value = "account", required = true) String key1,
            @RequestParam(required = false, defaultValue = "0") int page,
            String key2
    ) {
        return "key1:" + key1 + " page:" + page + " key2:" + key2;
    }

    /* get collection parameter */
    /* /root/data3?key1=1&key1=2&key1=3&key2=4&key2=5&key2=6 */
    @RequestMapping("/data3")
    public String data3(@RequestParam List<String> key1, @RequestParam(value = "key2") List<String> test) {
        return "key1:" + key1 + " test:" + test;
    }

    /* get parameter by entity */
    /* /root/data4?name=test1&age=18      */
    @RequestMapping("/data4")
    public String data4(UserEntity user) {
        return user.toString();
    }

}
