package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;
import com.example.shoolmanagement.school.repository.AdminRepository;
import com.example.shoolmanagement.school.repository.StudentRepository;
import com.example.shoolmanagement.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/*

public class AdminServiceApp implements AdminService{

    private TeacherRepository teacherRepository;
    private StudentRepository studentRepository;

    @Autowired
    public AdminServiceApp(){

    }

    @Autowired
    public AdminServiceApp(TeacherRepository theTeacherRepository){
        this.teacherRepository = theTeacherRepository;
    }

    @Autowired
    public AdminServiceApp(StudentRepository studentRepository){
       this.studentRepository = studentRepository;
    }
    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();

    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Teacher findByIdTch(int theID) {
        Optional<Teacher> result = teacherRepository.findById(theID);

        Teacher teacher  = null;

        if(result.isPresent()){
            teacher = result.get();
        }
        else{
            throw new RuntimeException("Dont find Teacher ID - "+theID);
        }
        return teacher;
    }

    @Override
    public Student findByIdSt(int theID) {
        Optional<Student> result = studentRepository.findById(theID);

        Student student  = null;

        if(result.isPresent()){
            student = result.get();
        }
        else{
            throw new RuntimeException("Dont find Teacher ID - "+theID);
        }
        return student;
    }

    @Override
    public void saveStudent(Student student) {
            studentRepository.save(student);
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteStudent(int theId) {
            // delete student by ID

        studentRepository.deleteById(theId);

    }
    @Override
    public void deleteTeacher(int theId) {
        // delete teacher by ID
        teacherRepository.deleteById(theId);

    }
}*/
