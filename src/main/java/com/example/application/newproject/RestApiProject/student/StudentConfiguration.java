package com.example.application.newproject.RestApiProject.student;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(StudentReposytory studentReposytory) {
       return args -> {
           studentReposytory.saveAll(List.of(
                   new Student("Alex","alex@mai.ru", LocalDate.of(2000, Month.MAY, 1)),
                   new Student("Simona", "simona@mai.ru", LocalDate.of(2003, Month.SEPTEMBER, 5)),
                   new Student("Tom", "tom@mai.ru", LocalDate.of(2000, Month.OCTOBER, 19))
           ));
       };
    }
}
