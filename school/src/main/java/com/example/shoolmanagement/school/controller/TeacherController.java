package com.example.shoolmanagement.school.controller;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;
import com.example.shoolmanagement.school.repository.AdminRepository;

import com.example.shoolmanagement.school.service.StudentService;
import com.example.shoolmanagement.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/school")
public class TeacherController {

    private TeacherService teacherService;

    @GetMapping("/teacherhello")
    public String teacherInfo(){
        return "hello";
    }

}
