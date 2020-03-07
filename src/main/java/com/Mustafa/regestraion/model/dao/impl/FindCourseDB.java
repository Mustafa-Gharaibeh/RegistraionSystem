package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.utils.DBConnection;
import com.Mustafa.regestraion.model.entity.course.Course;
import com.Mustafa.regestraion.model.entity.course.CourseBuilder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindCourseDB {
    protected static Course find(StringBuilder query) {
        Connection connection = DBConnection.getInstance();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query.toString());
            return courseResultSetHandling(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }


    private static Course courseResultSetHandling(ResultSet resultSet) throws SQLException {

        if (resultSet.next()) {
            return new CourseBuilder().
                    setId(resultSet.getString(1)).
                    setCode(resultSet.getString(2)).
                    setCourse_Name(resultSet.getString(3)).
                    setInstructorId(resultSet.getString(4)).
                    setCapacity(resultSet.getInt(5)).
                    setStartingDate(resultSet.getDate(6).toLocalDate()).
                    setDuration(resultSet.getInt(7)).
                    setHour(resultSet.getInt(8)).build();
        }
        return null;
    }
}
