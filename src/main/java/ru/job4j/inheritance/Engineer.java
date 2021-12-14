package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String specialization;

    public Engineer(String specialization) {
        super("Ivan", "Ivanov", "High", "12.03.93");
        this.specialization = specialization;
    }

    public Project invent(Idea idea) {
        return new Project();
    }
}
