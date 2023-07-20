package org.example.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        Book book01 = context.getBean("book01", Book.class);
        System.out.println(book01);
    }
}
