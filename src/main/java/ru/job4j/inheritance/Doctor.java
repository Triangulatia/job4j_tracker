package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String field;

    public Doctor(String field) {
        super();
        this.field = field;
    }

    public boolean veterinarian(Patient patient) {
        return true;
    }
}
