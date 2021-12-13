package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String language) {
        super("computer science");
        this.language = language;
    }

    public Product develop(Project project) {
        return new Product();
    }
}
