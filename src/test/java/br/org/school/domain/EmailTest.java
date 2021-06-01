package br.org.school.domain;

import br.org.school.domain.student.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void shouldNotCreateEmailWithInvalidAddress(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("invalidaddress"));
    }

    @Test
    void shouldCreateEmailWithValidAddress() {
        String endereco = "fulano@gmail.com.br";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getAddress());
    }
}
