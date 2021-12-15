package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String specialization;

    public Engineer(String specialization, String name,
                    String surname, String education,
                    String birthday) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public Project invent(Idea idea) {
        return new Project();
    }
}
