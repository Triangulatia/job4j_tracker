package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int experience;

    public Surgeon(int experience, String field,
                   String name, String surname,
                   String education, String birthday) {
        super(field, name, surname, education, birthday);
        this.experience = experience;
    }

    public boolean operation(Patient patient) {
        return true;
    }
}
