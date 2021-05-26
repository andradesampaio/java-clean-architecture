package br.org.school.model;

public class CPF{

    private String documentNumber;

    public CPF(String documentNumber){
        if (documentNumber == null ||
                !documentNumber.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Invalid CPF!");
        }
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
}
