package com.example.application.newproject.RestApiProject.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentReposytory extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);
}
