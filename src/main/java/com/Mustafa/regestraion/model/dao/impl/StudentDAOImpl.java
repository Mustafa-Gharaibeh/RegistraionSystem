package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.StudentDAO;
import com.Mustafa.regestraion.model.entity.Student;

import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {
    public Student findById(String id) throws SQLException {
        String query = "SELECT * From registration.student where id=" + id;
        return FindDB.find(query);
    }

    public Student findByEmail(String email) throws SQLException {
        String query = "SELECT * From registration.student where Email = " + email;
        return FindDB.find(query);
    }

    public boolean createStudent(Student newStudent) throws SQLException {
        String query = "insert into registration.student (id,First_Name,Last_Name" +
                ",Email,Password,Join_Year) values ('" + newStudent.getId() + "', '" +
                newStudent.getFirstName() + "', '" + newStudent.getLastName() + "', '" +
                newStudent.getEmail() + "', '" + newStudent.getPassword() + "', '"
                + newStudent.getJoinYear() + "')";
        return UpdateDB.Update(query);
    }

    public boolean updateStudent(Student student) throws SQLException {
        String query = "Update registration.student set " +
                "First_Name='" + student.getFirstName() + "', " +
                "Last_Name='" + student.getLastName() + "', " +
                "Email='" + student.getEmail() + "', " +
                "Password='" + student.getPassword() + "', " +
                "Join_Year='" + student.getJoinYear() + "' " +
                " where id='" + student.getId() + "'";
        return UpdateDB.Update(query);
    }

    public boolean deleteById(int id) throws SQLException {
        String query = "delete From registration.student where id =" + id;

        return UpdateDB.Update(query);
    }
}
