package br.org.school.usecase;

import br.org.school.domain.student.CPF;
import br.org.school.domain.student.Student;

import java.util.List;

public interface StudentUsecase {
    List<Student> getStudentList();
    Student getSingleStudent(CPF cpf);
    Student createStudent(Student student);
}
