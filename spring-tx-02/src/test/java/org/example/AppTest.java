package org.example;


import org.example.config.MyConfig;
import org.example.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(MyConfig.class)
public class AppTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        studentService.changeInfo();
    }

    @Test
    public void test1() {
        studentService.getStudents();
    }

}
