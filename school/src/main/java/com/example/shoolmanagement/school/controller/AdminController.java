package com.example.shoolmanagement.school.controller;

import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;
import com.example.shoolmanagement.school.service.StudentService;
import com.example.shoolmanagement.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/school/admin")
public class AdminController {

   // private AdminService adminService;
    private StudentService studentService;
    private TeacherService teacherService;



    public AdminController(TeacherService teacherService ,StudentService studentService){
       this.teacherService = teacherService;
       this.studentService = studentService;
    }


    @GetMapping("/adminTeacherList")
    public String adminLTeacherList(Model model){

        List<Teacher> teachers = teacherService.findAllTeachers();


        model.addAttribute("teacher",teachers);

        return "teacher/teacher-list";
    }

    @GetMapping("/adminStudentList")
    public String adminStudentList(Model model){
        List<Student> students = studentService.findAllStudents();


        model.addAttribute("students" , students);


        return "student/student-list";
    }

    @GetMapping("/adminAddingStudents")
    public String adminAddingStudents(Model model){
        Student student = new Student();

        model.addAttribute("student", student);

        return "student/student-form";
    }

    @GetMapping("/adminAddingTeachers")
    public String adminAddingTeachers(Model model){
        Teacher teacher = new Teacher();

        model.addAttribute("teacher", teacher);

        return "teacher/teacher-form";
    }

    @PostMapping("/saveTeacher")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {

        // save the employee
        teacherService.saveTeacher(teacher);

        // use a redirect to prevent duplicate submissions
        return "redirect:/school/admin/adminTeacherList";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {

        // save the employee
        studentService.saveStudent(student);

        // use a redirect to prevent duplicate submissions
        return "redirect:/school/admin/adminStudentList";
    }

}
