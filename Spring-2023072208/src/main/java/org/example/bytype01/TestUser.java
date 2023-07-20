package org.example.bytype01;

import org.example.bytype01.controller.UserController01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    /**
     * 1. attribute autowired
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("half.xml");

        UserController01 controller01 = context.getBean(UserController01.class);
        controller01.addUser();
    }

}
