package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String field;

    public Doctor(String field) {
        super("Petr", "Vincov", "High", "23.08.1990");
        this.field = field;
    }

    public boolean veterinarian(Patient patient) {
        return true;
    }
}
