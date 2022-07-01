package com.reactspring.studentssystem.model;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//con la anotacion @SComponen o @Service le decimos a spring que esta clase un una Spring Bean
//en este caso se va a usar @Service por semantica
@Service
public class StudentService {
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
