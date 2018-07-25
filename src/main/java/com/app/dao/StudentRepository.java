package com.app.dao;

import com.app.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    Student getStudentById(Long id);
}
