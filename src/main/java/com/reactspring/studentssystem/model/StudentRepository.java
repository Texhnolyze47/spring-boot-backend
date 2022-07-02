package com.reactspring.studentssystem.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//La anotacion @Repository indica que esta interface
//es la responsable en acceder en el acceso a los datos
@Repository
//aqui tenemos que especificar el tipo de objecto y el tipo que tiene el ID
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentsByEmail(String email);
}



