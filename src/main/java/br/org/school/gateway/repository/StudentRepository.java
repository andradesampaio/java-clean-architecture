package br.org.school.gateway.repository;

import br.org.school.domain.student.CPF;
import br.org.school.domain.student.Student;

import java.util.List;

public interface StudentRepository {

    Student addStudent(Student student);
    Student findByStudent(CPF cpf);
    List<Student> listAllStudent();

}
