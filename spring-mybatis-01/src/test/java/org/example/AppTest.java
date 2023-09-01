package org.example;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.EmployeeMapper;
import org.example.pojo.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class AppTest {

    @Test
    public void test01() throws IOException {

        // 1 read mybatis-config.xml file
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");

        // 2 create sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);

        // 3 create sqlSession from sqlsessionfactory
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4 create proxy instance
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.queryById(1);
        System.out.println("employee:" + employee);

        // 5 commit transaction
        sqlSession.commit();
        sqlSession.close();

    }
}
