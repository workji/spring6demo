package org.example.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void testUserObjectByXML() {
        // 1. load config xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2. get User object
        // ById
        User user1 = (User)context.getBean("user1");
        // ByType
        User user2 = context.getBean(User.class);
        // ById and Type
        User user3 = context.getBean("user1", User.class);

        // 3. user object do anything
        user1.show();
        user2.show();
        user3.show();

    }
}
