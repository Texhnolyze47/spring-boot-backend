package com.reactspring.studentssystem;

import com.reactspring.studentssystem.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
public class StudentssystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentssystemApplication.class, args);
	}


}
