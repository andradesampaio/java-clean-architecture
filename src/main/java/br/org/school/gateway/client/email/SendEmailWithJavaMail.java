package br.org.school.gateway.client.email;

import br.org.school.domain.indication.SendEmailIndication;
import br.org.school.domain.student.Student;

public class SendEmailWithJavaMail implements SendEmailIndication {
    @Override
    public void sendEmail(Student indication) {
        System.out.printf("Send email sucess");
    }
}
