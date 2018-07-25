package com.app.service;

import com.app.dao.StudentRepository;
import com.app.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return this.studentRepository.getStudentById(id);
    }

    public void saveToDb(Student student){
        studentRepository.save(student);
    }
}
