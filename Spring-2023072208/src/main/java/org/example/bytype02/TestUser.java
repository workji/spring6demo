package org.example.bytype02;

import org.example.bytype02.controller.UserController02;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    /**
     * 2. set method autowired
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("half.xml");

        UserController02 controller01 = context.getBean(UserController02.class);
        controller01.addUser();
    }

}
