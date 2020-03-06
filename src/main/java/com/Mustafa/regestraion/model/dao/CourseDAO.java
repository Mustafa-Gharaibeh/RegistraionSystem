package com.Mustafa.regestraion.model.dao;

import com.Mustafa.regestraion.model.entity.course.Course;


public interface CourseDAO {
    Course findById(String id);

    Course findByCode(String code);

    Course findByInstructorId(String instructorId);

    boolean createCourse(Course course);

    boolean updateCourse(Course course);

    boolean deleteById(int id);
}
