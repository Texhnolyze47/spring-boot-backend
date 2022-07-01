package com.reactspring.studentssystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//con la anotacion @SComponen o @Service le decimos a spring que esta clase un una Spring Bean
//en este caso se va a usar @Service por semantica
@Service
public class StudentService {

    private  final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
    return  studentRepository.findAll();

    }
}
