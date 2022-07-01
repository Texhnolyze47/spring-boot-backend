package com.reactspring.studentssystem;

import com.reactspring.studentssystem.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
@RestController
public class StudentssystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentssystemApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
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
