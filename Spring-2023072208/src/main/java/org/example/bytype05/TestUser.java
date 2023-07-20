package org.example.bytype05;

import org.example.bytype05.controller.UserController05;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    /**
     * 5. only one with argument constructor
     * can not have no argument constructor
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("half.xml");

        UserController05 controller05 = context.getBean(UserController05.class);
        controller05.addUser();
    }

}
