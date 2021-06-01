package br.org.school.usecase;

import br.org.school.domain.student.CPF;
import br.org.school.domain.student.Student;
import br.org.school.gateway.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentUsecaseImpl implements StudentUsecase {

    private StudentRepository studentRepository;

    public StudentUsecaseImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.listAllStudent();
    }

    @Override
    public Student getSingleStudent(CPF cpf) {
        return studentRepository.findByStudent(cpf);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.addStudent(student);
    }
}
