package com.example.shoolmanagement.school.entity;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH
    
    })
    @JoinColumn(name="teacher_id")
    private Teacher teacher;
    
    public Student(){
        
    }
    
    public Student(String firstName , String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    
}
