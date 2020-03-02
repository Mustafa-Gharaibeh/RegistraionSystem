package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.StudentDAO;
import com.Mustafa.regestraion.model.dao.utils.DBConnection;
import com.Mustafa.regestraion.model.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {
    public Student findById(String id) throws SQLException {
        String query = "SELECT * From student.student where id="+id;
        return FindDB.find(query);
    }

    public Student findByEmail(String email) throws SQLException {
        String query = "SELECT * From student.student where Email = "+email;
        return FindDB.find(query);
    }

    public boolean createStudent(Student newStudent) {
        return false;
    }

    public boolean updateStudent(Student student) {
        return false;
    }

    public boolean deleteById(int id) throws SQLException {
        String query = "delete From student.student where id ="+id;

        return DeleteUpdateDB.delete(query);
    }
}
