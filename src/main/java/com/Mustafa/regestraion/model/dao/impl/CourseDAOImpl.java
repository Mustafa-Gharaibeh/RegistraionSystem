package com.Mustafa.regestraion.model.dao.impl;

import com.Mustafa.regestraion.model.dao.CourseDAO;
import com.Mustafa.regestraion.model.entity.course.Course;

public class CourseDAOImpl implements CourseDAO {
    @Override
    public Course findById(String id) {
        StringBuilder query = new StringBuilder("SELECT * From registration.course where id= ");
        query.append(id);
        return FindCourseDB.find(query);
    }

    @Override
    public Course findByCode(String code) {
        StringBuilder query = new StringBuilder("SELECT * From registration.course where course_code= ");
        query.append(code);
        return FindCourseDB.find(query);
    }

    @Override
    public Course findByInstructorId(String instructorId) {
        StringBuilder query = new StringBuilder("SELECT * From registration.course where instructor_Id= ");
        query.append(instructorId);
        return FindCourseDB.find(query);
    }

    @Override
    public boolean createCourse(Course course) {
        StringBuilder query = new StringBuilder("insert into registration.course values ('");
        query.append(course.getId() + "','");
        query.append(course.getCode() + "','");
        query.append(course.getCourse_Name() + "','");
        query.append(course.getInstructorId() + "','");
        query.append(course.getCapacity() + "','");
        query.append(course.getStartingDate() + "','");
        query.append(course.getDuration() + "','");
        query.append(course.getHour() + "')");

        return UpdateDB.Update(query.toString());
    }

    @Override
    public boolean updateCourse(Course course) {
        String query = "Update registration.course set " +
                "Course_Code='" + course.getCode() +
                "',Course_Name='" + course.getCourse_Name() +
                "',Instructor_Id='" + course.getInstructorId() +
                "',Capacity='" + course.getCapacity() +
                "',Starting_Date='" + course.getStartingDate() +
                "',Duration='" + course.getDuration() +
                "',Hour='" + course.getHour() +
                "'where id=" + course.getId();

        return UpdateDB.Update(query);
    }

    @Override
    public boolean deleteById(int id) {
        String query = "delete From registration.course where id =" + id;

        return UpdateDB.Update(query);
    }
}
