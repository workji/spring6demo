package org.example.dao;

import org.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateNameById(String name, Integer id) {
        String sql = "update students set name = ? where id = ? ;";
        int rows = jdbcTemplate.update(sql, name, id);
    }

    public void updateAgeById(Integer age, Integer id) {
        String sql = "update students set age = ? where id = ? ;";
        int rows = jdbcTemplate.update(sql, age, id);
    }

    public List<Student> getStudents() {
        String sql = "select * from students";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
}