package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.utils.DBConnection;
import com.Mustafa.regestraion.model.entity.student.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindStudentDB {

    protected static Student find(StringBuilder query) {
        Connection connection = DBConnection.getInstance();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query.toString());
            return studentResultSetHandling(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }


    private static Student studentResultSetHandling(ResultSet resultSet) throws SQLException {
        Student student = new Student();
        if (resultSet.next()) {
            student.setId(resultSet.getString(1));
            student.setFirstName(resultSet.getString(2));
            student.setLastName(resultSet.getString(3));
                student.setEmail(resultSet.getString(4));
                student.setPassword(resultSet.getString(5));
                student.setJoinYear(resultSet.getInt(6));
            }
            return student;
        }



}
