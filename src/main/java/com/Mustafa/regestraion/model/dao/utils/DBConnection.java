package com.Mustafa.regestraion.model.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    private DBConnection() {

    }

    public static Connection getInstance() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root",
                        "root", "root");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
