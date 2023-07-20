package org.example.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        User user01 = context.getBean("user01", User.class);
        System.out.println("6 bean create complete");
        System.out.println(user01);

        context.close();

        System.out.println("8 destroy Application Context");
    }
}
