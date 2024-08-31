package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Admin;
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

@Service
public class AdminServiceApp implements AdminService{

    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceApp(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Admin> adminList() {
       return adminRepository.findAll();
    }

    @Override
    public void saveAdmin(Admin admin) {
            adminRepository.save(admin);
    }
}
