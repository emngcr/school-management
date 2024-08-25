package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;
import com.example.shoolmanagement.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceApp implements TeacherService{

    private TeacherRepository teacherRepository;

    TeacherServiceApp(){

    }

    @Autowired
    TeacherServiceApp(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findByIdTeacher(int theID) {
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
    public void saveTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(int theId) {
        teacherRepository.deleteById(theId);
    }
}
