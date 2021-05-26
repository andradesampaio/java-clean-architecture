package br.org.school.model;

public class Phone{

       private String ddd;
       private String number;

    public Phone(String ddd, String number) {
        if (ddd == null || number == null) {
            throw new IllegalArgumentException("DDD and number are mandatory!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("Invalid DDD!");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Invalid number!");
        }
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }
}
