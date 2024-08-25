package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAllTeachers();


    Teacher findByIdTeacher(int theID);



    void saveTeacher(Teacher teacher);



    void deleteTeacher(int theId);

}
