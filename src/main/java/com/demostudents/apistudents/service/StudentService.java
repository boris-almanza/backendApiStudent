package com.demostudents.apistudents.service;

import java.util.List;

import com.demostudents.apistudents.model.Student;

public interface StudentService {

    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
    
}
