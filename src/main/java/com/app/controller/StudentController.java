package com.app.controller;

import com.app.entity.Student;
import com.app.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "get a specific student by id from the database", notes = "get a student by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Student retrieved successfully"),
            @ApiResponse(code = 404, message = "Student was not found")
    })
    public Student getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    @ApiOperation(value = "list all students from the database", notes = "get all students")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of students retrieved successfully"),
            @ApiResponse(code = 404, message = "Students not found")
    })
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/createStudent/{id}")
    @ApiOperation(value = "create a student with the id specified", notes = "create a student")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Object persisted successfully"),
            @ApiResponse(code = 401, message = "Not authorized to create a student")
    })
    public void createStudentWithId(@PathVariable("id") Long id) {
        Student student = new Student("John", "Smith", id);
        studentService.saveToDb(student);
    }

    @PostMapping("/createStudent/create")
    @ApiOperation(value = "create a student", notes = "create a student")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Object persisted successfully"),
            @ApiResponse(code = 401, message = "Not authorized to create a student")
    })
    public ResponseEntity createStudent(@RequestBody Student student) {
        studentService.saveToDb(student);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
