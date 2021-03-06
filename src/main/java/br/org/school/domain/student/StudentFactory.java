package br.org.school.domain.student;

public class StudentFactory{

    private Student student;

    public StudentFactory withNameCpfEmail(String name, String cpf, String email) {
        this.student = new Student(name, new CPF(cpf), new Email(email));
        return this;
    }

    public StudentFactory withPhone(String ddd, String number) {
        this.student.addPhone(ddd, number);
        return this;
    }

    public Student build() {
        return this.student;
    }
}
