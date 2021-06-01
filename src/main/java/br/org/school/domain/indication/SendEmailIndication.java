package br.org.school.domain.indication;

import br.org.school.domain.student.Student;

public interface SendEmailIndication {
    void sendEmail(Student indication);
}
