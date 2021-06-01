package br.org.school.gateway.repository;

import br.org.school.domain.student.CPF;
import br.org.school.domain.student.Student;
import br.org.school.exception.StudentNotFound;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepositoryImpl implements StudentRepository {

    private List<Student> matriculate = new ArrayList<>();

    @Override
    public Student addStudent(Student student) {
        this.matriculate.add(student);
        return student;
    }

    @Override
    public Student findByStudent(CPF cpf) {
        return this.matriculate.stream()
                .filter(a -> a.getCpf().equals(cpf.getDocumentNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> listAllStudent() {
        return this.matriculate;
    }
}
