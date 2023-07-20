package org.example.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

    @Test
    public void test01() {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/chinascope?characterEncoding=UTF-8&serverTimezone=JST");
        dataSource.setUsername("jxm");
        dataSource.setPassword("1234567890");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        System.out.println(dataSource.getUrl());
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        DruidDataSource dataSource = context.getBean("dataSource01", DruidDataSource.class);

        System.out.println(dataSource.getUrl());
    }
}
