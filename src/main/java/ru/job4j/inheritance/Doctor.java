package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String field;

    public Doctor(String field, String name,
                  String surname, String education,
                  String birthday) {
        super(name, surname, education, birthday);
        this.field = field;
    }

    public boolean veterinarian(Patient patient) {
        return true;
    }
}
