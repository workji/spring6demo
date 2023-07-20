package org.example.bytype04;

import org.example.bytype04.controller.UserController04;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    /**
     * 4. parameter autowired
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("half.xml");

        UserController04 controller04 = context.getBean(UserController04.class);
        controller04.addUser();
    }

}
