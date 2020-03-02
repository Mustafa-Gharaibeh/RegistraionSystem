package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.utils.DBConnection;
import com.Mustafa.regestraion.model.entity.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUpdateDB {

    protected static boolean delete (String query) throws SQLException {
        Connection connection= DBConnection.getInstance();
        Statement statement=connection.createStatement();
    //   int number=statement.executeUpdate(query);
       if(statement.executeUpdate(query)==0)
           return false;
       else return true;

    }

}
