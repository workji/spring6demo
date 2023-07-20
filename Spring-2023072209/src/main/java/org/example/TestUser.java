package org.example;


import org.example.config.SpringConfig;
import org.example.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

    @Test
    public void test01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserController controller01 = context.getBean(UserController.class);
        controller01.addUser();
    }
}
