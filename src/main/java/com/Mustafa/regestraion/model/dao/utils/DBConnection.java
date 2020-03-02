package com.Mustafa.regestraion.model.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;
    private DBConnection(){

    }

    public static Connection getInstance() throws SQLException {
        if (connection==null){
            connection= DriverManager.getConnection("jdbc:mysql://localhost:52413/?user=root","root","root@JEA");

        }
        return connection;
    }
}
