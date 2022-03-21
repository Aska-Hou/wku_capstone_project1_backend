package com.wku.dao.impl;

import com.wku.dao.StudentDao;
import com.wku.domain.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student login(String name, String password) {
        Student student =  jdbcTemplate.queryForObject("select * from student where name = ? and password = ? ",
                new BeanPropertyRowMapper<Student>(Student.class),name,password);
        return student;
    }
}
