package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;
import com.example.shoolmanagement.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceApp implements StudentService{
    private StudentRepository studentRepository;

    StudentServiceApp(){

    }
    @Autowired
    public StudentServiceApp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByIdStudent(int theID) {
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
    public void deleteStudent(int theId) {
        // delete student by ID

        studentRepository.deleteById(theId);
    }
}
