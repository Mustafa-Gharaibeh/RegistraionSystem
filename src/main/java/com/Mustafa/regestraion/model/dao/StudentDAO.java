package com.Mustafa.regestraion.model.dao;

import com.Mustafa.regestraion.model.entity.student.Student;

public interface StudentDAO {
    Student findById(String id);

    Student findByEmail(String email);

    boolean createStudent(Student newStudent);

    boolean updateStudent(Student newStudent);

    boolean deleteById(int id);
}
