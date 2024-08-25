package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();


    Student findByIdStudent(int theID);

    void saveStudent(Student student);


    void deleteStudent(int theId);



}
