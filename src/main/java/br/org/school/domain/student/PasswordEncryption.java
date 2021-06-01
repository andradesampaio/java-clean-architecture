package br.org.school.domain.student;

public interface PasswordEncryption {

    String passwordEncrypt(String password);

    boolean validatePasswordEncrypted(String passwordEncrypted, String password);
}
