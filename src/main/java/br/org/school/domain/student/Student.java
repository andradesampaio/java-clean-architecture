package br.org.school.domain.student;
import java.util.ArrayList;
import java.util.List;

public class Student{
        private String name;
        private CPF cpf;
        private Email email;
        private List<Phone> phone  = new ArrayList<>();
        private String password;

    public Student(String name, CPF cpf, Email email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }
    public void addPhone(String ddd, String number) {
        this.phone.add(new Phone(ddd, number));
    }

    public String getName() {
        return name;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}
