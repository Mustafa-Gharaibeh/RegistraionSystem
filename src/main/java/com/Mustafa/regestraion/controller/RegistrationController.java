package com.Mustafa.regestraion.controller;

import com.Mustafa.regestraion.model.dao.ScheduleDAO;

public class RegistrationController {
    private ScheduleDAO scheduleDAO;

    public RegistrationController(ScheduleDAO scheduleDAO) {
        this.scheduleDAO = scheduleDAO;
    }

    public boolean register(String studentId, String courseId) {

        return this.scheduleDAO.addSchedule(studentId, courseId);
    }
}
