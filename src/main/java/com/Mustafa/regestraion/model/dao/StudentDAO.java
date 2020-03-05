package com.Mustafa.regestraion.model.dao;

import com.Mustafa.regestraion.model.entity.student.Student;

import java.sql.SQLException;

public interface StudentDAO {
    Student findById(String id) throws SQLException;

    Student findByEmail(String email) throws SQLException;

    boolean createStudent(Student newStudent) throws SQLException;

    boolean updateStudent(Student newStudent) throws SQLException;

    boolean deleteById(int id) throws SQLException;
}
