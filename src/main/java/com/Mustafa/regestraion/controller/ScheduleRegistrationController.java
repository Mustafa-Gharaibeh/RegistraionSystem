package com.Mustafa.regestraion.controller;

import com.Mustafa.regestraion.model.dao.CourseDAO;
import com.Mustafa.regestraion.model.dao.ScheduleDAO;
import com.Mustafa.regestraion.model.dao.StudentDAO;
import com.Mustafa.regestraion.model.entity.course.Course;
import com.Mustafa.regestraion.model.entity.student.Student;

import java.time.LocalDate;

public class ScheduleRegistrationController {
    private ScheduleDAO scheduleDAO;
    private StudentDAO studentDAO;
    private CourseDAO courseDAO;

    public ScheduleRegistrationController(ScheduleDAO scheduleDAO, StudentDAO studentDAO,
                                          CourseDAO courseDAO) {
        this.scheduleDAO = scheduleDAO;
        this.studentDAO = studentDAO;
        this.courseDAO = courseDAO;
    }

    public boolean register(String studentId, String courseId) {
        Student student = studentDAO.findById(studentId);
        if (student == null)
            throw new RuntimeException("Student ID not available");

        if (!this.scheduleDAO.isRegistered(studentId, courseId))
            throw new RuntimeException("Student already registered in this course");

        Course course = courseDAO.findById(courseId);
        if (course.getCapacity() <= scheduleDAO.findStudents(courseId).size())
            throw new RuntimeException("Course Capacity is Full");

        if (course.getStartingDate().compareTo(LocalDate.now()) < 0)
            throw new RuntimeException("Course already Started");

        return this.scheduleDAO.addSchedule(studentId, courseId);

    }
}
