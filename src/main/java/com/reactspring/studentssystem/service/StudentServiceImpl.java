package com.reactspring.studentssystem.service;

import com.reactspring.studentssystem.model.Student;
import com.reactspring.studentssystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //Metodo para guardar la info de un estudiante
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
