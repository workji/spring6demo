package org.example.aop.xml;

import org.example.aop.anno.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        org.example.aop.anno.Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2,3);
    }
}
