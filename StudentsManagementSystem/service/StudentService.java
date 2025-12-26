package com.StudentsManagementSystem.service;

import com.StudentsManagementSystem.Repository.StudentRepository;
import com.StudentsManagementSystem.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student getById(int id);

    public void deleteById(int id);
}
