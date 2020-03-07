package com.Mustafa.regestraion.veiw;

import com.Mustafa.regestraion.controller.ScheduleRegistrationController;
import com.Mustafa.regestraion.model.dao.impl.CourseDAOImpl;
import com.Mustafa.regestraion.model.dao.impl.ScheduleDAOImpl;
import com.Mustafa.regestraion.model.dao.impl.StudentDAOImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ScheduleRegistrationController registrationController =
                new ScheduleRegistrationController(new ScheduleDAOImpl(),
                        new StudentDAOImpl(), new CourseDAOImpl());
        System.out.println(registrationController.register("2", "1"));
    }
}
