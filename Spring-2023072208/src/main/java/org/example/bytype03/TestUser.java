package org.example.bytype03;

import org.example.bytype03.controller.UserController03;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    /**
     * 3. constructor autowired
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("half.xml");

        UserController03 controller01 = context.getBean(UserController03.class);
        controller01.addUser();
    }

}
