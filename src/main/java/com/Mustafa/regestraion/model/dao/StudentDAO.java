package com.Mustafa.regestraion.model.dao;

import com.Mustafa.regestraion.model.entity.Student;

import java.sql.SQLException;

public interface StudentDAO {
    Student findById(String id) throws SQLException;
    Student findByEmail(String email) throws SQLException;
    boolean createStudent(Student newStudent);
    boolean updateStudent(Student newStudent);
    boolean deleteById(String id);
}
