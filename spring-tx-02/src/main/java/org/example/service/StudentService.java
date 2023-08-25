package org.example.service;

import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void changeInfo() {
        studentDao.updateAgeById(88, 1);
        int i = 1/0;
        System.out.println("--------------------------------");
        studentDao.updateNameById("good1", 1);
    }

    @Transactional(readOnly = true)
    public void getStudents() {
        List<Student> students = studentDao.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
