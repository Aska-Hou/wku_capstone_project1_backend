package com.wku.dao;

import com.wku.domain.Student;

public interface StudentDao {
    Student login(String name, String password);
}
