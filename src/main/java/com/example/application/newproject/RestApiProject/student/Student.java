package com.example.application.newproject.RestApiProject.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private LocalDate dod;

    public Student() {
    }

    public Student(String name, String email, LocalDate dod) {
        this.name = name;
        this.email = email;
        this.dod = dod;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDod() {
        return dod;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return Period.between(dod, LocalDate.now()).getYears();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDod(LocalDate dod) {
        this.dod = dod;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dod=" + dod +
                '}';
    }
}
