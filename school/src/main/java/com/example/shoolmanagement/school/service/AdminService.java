package com.example.shoolmanagement.school.service;

import com.example.shoolmanagement.school.entity.Admin;
import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.entity.Teacher;

import java.util.List;

public interface AdminService {
     List<Admin> adminList();
     void saveAdmin(Admin admin);
}
