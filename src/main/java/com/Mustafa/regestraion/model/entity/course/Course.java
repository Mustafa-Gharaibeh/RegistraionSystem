package com.Mustafa.regestraion.model.entity.course;

import java.time.LocalDate;

public class Course {
    private String id;
    private String code;
    private String course_Name;
    private String instructorId;
    private int capacity;
    private LocalDate startingDate;
    private int duration;
    private int hour;

    public Course(String id, String code, String course_Name, String instructorId,
                  int capacity, LocalDate startingDate, int duration, int hour) {
        this.id = id;
        this.code = code;
        this.course_Name = course_Name;
        this.instructorId = instructorId;
        this.capacity = capacity;
        this.startingDate = startingDate;
        this.duration = duration;
        this.hour = hour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", course_Name='" + course_Name + '\'' +
                ", instructorId='" + instructorId + '\'' +
                ", capacity=" + capacity +
                ", startingDate=" + startingDate +
                ", duration=" + duration +
                ", hour=" + hour +
                '}';
    }
}
