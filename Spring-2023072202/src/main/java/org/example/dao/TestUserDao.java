package org.example.dao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    @Test
    public void test01() {
        // 1. load config xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 2. get User object
        Userdao impl01 = context.getBean(Userdao.class);

        // 3. user object do anything
        impl01.run();
    }

    @Test
    public void test02() {
        // 1. load config xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");

        // 2. get User object
        // Userdao impl01 = context.getBean(Userdao.class); // No qualifying bean of type

        Userdao impl01 = context.getBean("impl01", Userdao.class);
        Userdao impl02 = context.getBean("impl02", Userdao.class);

        // 3. user object do anything
        impl01.run();
        impl02.run();
    }
}
