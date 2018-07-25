package com.app.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ApiModel(description = "Student object")
public class Student {
    @Id
    @ApiModelProperty(notes = "ID of the student", required = true, position = 0)
    private Long id;

    @ApiModelProperty(notes = "Name of the student", required = true, position = 2)
    private String name;

    @ApiModelProperty(notes = "The course the student is enrolled to", required = false, position = 1)
    private String course;

    public Student() {
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
