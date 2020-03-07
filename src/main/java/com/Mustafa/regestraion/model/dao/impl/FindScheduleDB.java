package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.utils.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FindScheduleDB {
    protected static List<String> findSchedule(StringBuilder query, String resultType) {
        Connection connection = DBConnection.getInstance();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query.toString());
            return resultSetHandling(resultSet, resultType);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> resultSetHandling(ResultSet resultSet, String resultType) throws SQLException {
        List<String> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(resultSet.getString(resultType));
        }
        return list;
    }


}
