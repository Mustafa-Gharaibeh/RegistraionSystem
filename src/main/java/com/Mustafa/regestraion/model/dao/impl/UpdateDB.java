package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.utils.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

    protected static boolean Update(String query) {
        Connection connection = DBConnection.getInstance();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            return statement.executeUpdate(query) != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
