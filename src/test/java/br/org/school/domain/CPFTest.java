package br.org.school.domain;

import br.org.school.domain.student.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {
    @Test
    void shouldNotCreateCPFWithInvalidDocumentNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));
    }

    @Test
    void shouldAllowCreateCPFValidDocumentNumber() {
        String documentNumber = "123.456.789-00";
        CPF cpf = new CPF(documentNumber);
        assertEquals(documentNumber, cpf.getDocumentNumber());
    }

}
