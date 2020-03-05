package com.Mustafa.regestraion.main;

import com.Mustafa.regestraion.model.dao.StudentDAO;
import com.Mustafa.regestraion.model.dao.impl.StudentDAOImpl;
import com.Mustafa.regestraion.model.entity.student.StudentBuilder;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentDAO studentDAO = new StudentDAOImpl();

        if (studentDAO.updateStudent(new StudentBuilder().setId("1").setFirstName("Ahmad").
                setLastName("GH").setEmail("xx@xx.com").setPassword("9876543210").
                setJoinYear(2014).build()))
            System.out.println("Updated");
        else
            System.out.println("Not Updated");

    }



}
