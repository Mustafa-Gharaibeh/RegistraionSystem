package com.Mustafa.regestraion.main;

import com.Mustafa.regestraion.model.dao.StudentDAO;
import com.Mustafa.regestraion.model.dao.impl.StudentDAOImpl;
import com.Mustafa.regestraion.model.entity.Student;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentDAO studentDAO=new StudentDAOImpl();
        Student student=studentDAO.findById("1");
        System.out.println(student.toString());
        Student student1= studentDAO.findByEmail("'rrr'");
        System.out.println(student1.toString());


       if( studentDAO.deleteById(2))
       {
           System.out.println("delete record successfully");

       }

       else
           System.out.println("delete record failed");
    }
}
