package org.example.auto;

import org.example.auto.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto-bytype.xml");

        UserController controller01 = context.getBean("controller01", UserController.class);
        controller01.addUser();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto-byname.xml");

        UserController controller01 = context.getBean("controller01", UserController.class);
        controller01.addUser();
    }
}
