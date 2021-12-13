package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int experience;

    public Surgeon(int experience) {
        super("veterinary");
        this.experience = experience;
    }

    public boolean operation(Patient patient) {
        return true;
    }
}
