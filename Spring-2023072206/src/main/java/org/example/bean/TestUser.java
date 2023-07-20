package org.example.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void test01() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");

        User user01 = context.getBean("user01", User.class);
        System.out.println(user01);

    }
}
