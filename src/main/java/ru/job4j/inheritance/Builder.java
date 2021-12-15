package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String buildings;

    public Builder(String buildings, String specialization,
                     String name, String surname,
                     String education, String birthday) {
        super(specialization, name, surname, education, birthday);
        this.buildings = buildings;
    }

    public Structure construction(Project project) {
        return new Structure();
    }
}
