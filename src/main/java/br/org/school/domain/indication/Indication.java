package br.org.school.domain.indication;

import br.org.school.domain.student.Student;

import java.time.LocalDateTime;

public class Indication {

    private Student student;
    private Student studentIndicative;
    private LocalDateTime dateIndication;

    public Indication(Student student, Student studentIndicative) {
        this.student = student;
        this.studentIndicative = studentIndicative;
        this.dateIndication = LocalDateTime.now();
    }

    public Student getStudent() {
        return student;
    }

    public Student getIndicative() {
        return studentIndicative;
    }

    public LocalDateTime getDateIndication() {
        return dateIndication;
    }
}
