package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    private Long id;

    private String name;
    private String course;

    public Student(){}

    public Student(String name, String course, Long id) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
