package com.Mustafa.regestraion.main;

import com.Mustafa.regestraion.model.dao.ScheduleDAO;
import com.Mustafa.regestraion.model.dao.impl.ScheduleDAOImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
        List<String> list = scheduleDAO.findCourses("3");
        for (String l : list)
            System.out.println(l);
    }



}
