package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.StudentDAO;
import com.Mustafa.regestraion.model.entity.student.Student;

public class StudentDAOImpl implements StudentDAO {
    public Student findById(String id) {
        StringBuilder query = new StringBuilder("SELECT * From registration.student where id= ");
        query.append(id);
        return FindStudentDB.find(query);
    }

    public Student findByEmail(String email) {
        StringBuilder query = new StringBuilder("SELECT * From registration.student where Email = ");
        query.append(email);
        return FindStudentDB.find(query);
    }

    public boolean createStudent(Student newStudent) {
        String query = "insert into registration.student (id,First_Name,Last_Name" +
                ",Email,Password,Join_Year) values ('" + newStudent.getId() + "', '" +
                newStudent.getFirstName() + "', '" + newStudent.getLastName() + "', '" +
                newStudent.getEmail() + "', '" + newStudent.getPassword() + "', '"
                + newStudent.getJoinYear() + "')";
        return UpdateDB.Update(query);
    }

    public boolean updateStudent(Student student) {
        String query = "Update registration.student set " +
                "First_Name='" + student.getFirstName() + "', " +
                "Last_Name='" + student.getLastName() + "', " +
                "Email='" + student.getEmail() + "', " +
                "Password='" + student.getPassword() + "', " +
                "Join_Year='" + student.getJoinYear() + "' " +
                " where id='" + student.getId() + "'";
        return UpdateDB.Update(query);
    }

    public boolean deleteById(int id) {
        String query = "delete From registration.student where id =" + id;

        return UpdateDB.Update(query);
    }
}
