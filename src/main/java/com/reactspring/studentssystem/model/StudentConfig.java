package com.reactspring.studentssystem.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ivan = new Student(
                    "Ivan",
                    "ivanr@gmail.com",
                    LocalDate.of(2001, DECEMBER, 14),
                    20
            );
            Student Erick = new Student(
                    "Erick",
                    "Erickr@gmail.com",
                    LocalDate.of(2002, JANUARY, 14),
                    20
            );

            repository.saveAll(
                    List.of(ivan, Erick)
            );
        };
    }

}
