package com.backendspring.studentssystem.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//con la anotacion @SComponen o @Service le decimos a spring que esta clase un una Spring Bean
//en este caso se va a usar @Service por semantica
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentsByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Este correo ya esta regsitrado");
        } else
            studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exits = studentRepository.existsById(studentId);
        if (!exits) {
            throw new IllegalStateException("El estudinate con el Id " + studentId + " no existe");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "El estudiante con el id" + studentId + "No existe"
                ));
        if(name != null &&
            name.length() > 0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }

        if(email != null &&
            email.length() > 0 &&
            !Objects.equals(student.getName(), email)){
            Optional<Student> studentOptional = studentRepository
                    .findStudentsByEmail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("El correo ya esta en uso");
            }
            student.setEmail(email);
        }
    }
}
