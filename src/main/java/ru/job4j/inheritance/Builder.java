package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String[] buildings;

    public Builder() {
        super("Engineering discipline");
    }

    public Structure construction(Project project) {
        return new Structure();
    }
}
