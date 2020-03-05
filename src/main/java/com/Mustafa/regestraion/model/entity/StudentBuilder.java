package com.Mustafa.regestraion.model.entity;

public class StudentBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int joinYear;

    public StudentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public StudentBuilder setJoinYear(int joinYear) {
        this.joinYear = joinYear;
        return this;
    }

    public Student build() {
        Student student = new Student();
        student.setId(this.id);
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        student.setEmail(this.email);
        student.setPassword(this.password);
        student.setJoinYear(this.joinYear);
        return student;
    }
}
