package com.reactspring.studentssystem.controller;

import com.reactspring.studentssystem.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//requestMapping es la ruta que debe tener nuestro localhost
// Ejemplo:
// http://localhost:8080/api/v1/student
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Ivan",
                        "ivan.r@gmail.com",
                        LocalDate.of(2001, Month.DECEMBER,14),
                        20
                )
        );

    }
}
