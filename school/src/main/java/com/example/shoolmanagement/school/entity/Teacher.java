package com.example.shoolmanagement.school.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    
    // çift tırnak içindekiler database işlemi olduğu için database ye göre adlandırılır
    @OneToMany(mappedBy = "teacher",
              fetch = FetchType.LAZY,
              cascade = {CascadeType.PERSIST,CascadeType.MERGE,
                          CascadeType.DETACH, CascadeType.REFRESH})
    private List<Student> students;
    
    public Teacher(){
        
    }

    public Teacher(String firstName, String lastName, List<Student> students) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", students=" + students +
                '}';
    }
}
