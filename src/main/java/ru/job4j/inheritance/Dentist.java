package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean therapists;

    public Dentist(boolean therapists, String field,
                   String name, String surname,
                   String education, String birthday) {
        super(field, name, surname, education, birthday);
        this.therapists = therapists;
    }

    public Tooth analysis(Patient patient) {
        return new Tooth();
    }
}
