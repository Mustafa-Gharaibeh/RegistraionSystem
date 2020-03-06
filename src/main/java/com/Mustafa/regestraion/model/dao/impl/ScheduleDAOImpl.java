package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.ScheduleDAO;

import java.util.List;

public class ScheduleDAOImpl implements ScheduleDAO {

    @Override
    public List<String> findStudents(String courseId) {
        StringBuilder query = new StringBuilder("SELECT * From registration.schedule where course_id= ");
        query.append(courseId);

        return FindScheduleDB.findSchedule(query, "student_id");
    }

    @Override
    public List<String> findCourses(String studentId) {
        StringBuilder query = new StringBuilder("SELECT * From registration.schedule where student_id= ");
        query.append(studentId);

        return FindScheduleDB.findSchedule(query, "course_id");
    }

    @Override
    public boolean addSchedule(String studentId, String courseId) {
        StringBuilder query = new StringBuilder("insert into registration.schedule values('");
        query.append(studentId).append("','").append(courseId).append("')");
        return UpdateDB.Update(query.toString());
    }


}
