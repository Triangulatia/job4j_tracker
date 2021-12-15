package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String language, String specialization,
                      String name, String surname,
                      String education, String birthday) {
        super(specialization, name, surname, education, birthday);
        this.language = language;
    }

    public Product develop(Project project) {
        return new Product();
    }
}
