package com.demostudents.apistudents.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demostudents.apistudents.model.Student;
import com.demostudents.apistudents.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        
        return studentRepository.findAll();
    }
    
}
