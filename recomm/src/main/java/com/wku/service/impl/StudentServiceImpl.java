package com.wku.service.impl;

import com.wku.dao.StudentDao;
import com.wku.domain.Student;
import com.wku.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student login(String name, String password){
        return studentDao.login(name,password);
    }
}
