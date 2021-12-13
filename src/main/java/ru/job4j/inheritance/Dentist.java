package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean therapists;

    public Dentist(boolean therapists) {
        super("Dental surgeon");
        this.therapists = therapists;
    }

    public Tooth analysis(Patient patient) {
        return new Tooth();
    }
}
