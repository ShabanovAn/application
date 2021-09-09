package com.example.application.newproject.RestApiProject.student;

import com.example.application.newproject.RestApiProject.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    private final StudentReposytory studentReposytory;

    public StudentService(StudentReposytory studentReposytory) {
        this.studentReposytory = studentReposytory;
    }

    public List<Student> list() {
        return studentReposytory.findAll();
    }

    public void add(Student student) {
       if (studentReposytory.findStudentByEmail(student.getEmail()).isPresent()){
           throw new RestApiException("Email is busy");
       }
       studentReposytory.save(student);
    }

    public void delete(Long studentId) {
        studentReposytory.deleteById(studentId);
    }

    public void update(Student student) {
        Optional <Student> row = studentReposytory.findById(student.getId());
        if (row.isPresent()){
            Student item = row.get();
            if (!student.getName().isEmpty()) {
                item.setName(student.getName());
            }
            if (student.getDod() != null) {
                item.setDod(student.getDod());
            }
            studentReposytory.save(item);
        }
    }
}
