package br.org.school.domain;

import br.org.school.domain.student.Phone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneTest {

    @Test
    void shouldNotCreatePhoneWithInvalidDDD() {
        assertThrows(IllegalArgumentException.class,
                () -> new Phone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("1", "123456789"));
    }

    @Test
    void shouldNotCreatePhoneWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", "123"));
    }

    @Test
    void shouldCreatePhoneWithValidDDDAndNumber() {
        String ddd = "11";
        String number = "123456789";
        Phone phone = new Phone(ddd, number);
        assertEquals(ddd, phone.getDdd());
        assertEquals(number, phone.getNumber());
    }
}
