package org.example.bytype06;

import org.example.bytype06.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    /**
     * 6. autowired with qualified
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("half.xml");

        UserController controller = context.getBean(UserController.class);
        controller.addUser();
    }

}
