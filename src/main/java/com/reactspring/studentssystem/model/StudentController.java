package com.reactspring.studentssystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

// @requestMapping es la ruta que debe tener nuestro localhost
// Ejemplo:
//
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    //Autowired
    //como necesitamos instance a studentService vamos a utilizar autowired
    //lo va a inyectar en el constructor
    //para esto la clase que vamos a llamar debe ser un spring bean
    @Autowired
    public  StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }


}
