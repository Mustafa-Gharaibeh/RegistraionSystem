package com.Mustafa.regestraion.model.entity.course;

public class CourseBuilder {
    private String id;
    private String code;
    private String course_Name;
    private String instructorId;
    private int capacity;
    private int startingDate;
    private int duration;
    private int hour;

    public CourseBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CourseBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public CourseBuilder setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
        return this;
    }

    public CourseBuilder setInstructorId(String instructorId) {
        this.instructorId = instructorId;
        return this;
    }

    public CourseBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public CourseBuilder setStartingDate(int startingDate) {
        this.startingDate = startingDate;
        return this;
    }

    public CourseBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public CourseBuilder setHour(int hour) {
        this.hour = hour;
        return this;
    }

    public Course build() {
        return new Course(id, code, course_Name, instructorId, capacity, startingDate,
                duration, hour);
    }
}
