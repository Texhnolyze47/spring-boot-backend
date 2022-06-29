package com.reactspring.studentssystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StudentssystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentssystemApplication.class, args);
	}


}
