package com.example.shoolmanagement.school;

import com.example.shoolmanagement.school.entity.Admin;
import com.example.shoolmanagement.school.entity.Student;
import com.example.shoolmanagement.school.service.AdminService;
import com.example.shoolmanagement.school.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(AdminService adminService){
		return  runner ->{
			//save(adminService);
		};
}

	private void save(AdminService adminService) {
		Admin admin = new Admin("John","Dere");
		System.out.println("Saving admin");
		adminService.saveAdmin(admin);
		System.out.println("DONE");
	}

}
    
