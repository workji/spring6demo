package org.example.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");

        Person person01 = context.getBean("person01", Person.class);
        System.out.println(person01);

        Person person02 = context.getBean("person02", Person.class);
        System.out.println(person02);
    }
}
