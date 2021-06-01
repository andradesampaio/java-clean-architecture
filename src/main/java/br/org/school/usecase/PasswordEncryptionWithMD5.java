package br.org.school.usecase;

import br.org.school.domain.student.PasswordEncryption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class PasswordEncryptionWithMD5 implements PasswordEncryption {
    @Override
    public String passwordEncrypt(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("error generating password hash");
        }
    }

    @Override
    public boolean validatePasswordEncrypted(String passwordEncrypted, String password) {
        return passwordEncrypted.equals(passwordEncrypt(password));
    }
}
