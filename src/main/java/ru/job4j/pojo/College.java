package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setPerson("Ivanov Ivan Ivanovich");
        student.setGroup("3");
        student.setDate("13.12.2021");
        System.out.println("Student: " + student.getPerson() + System.lineSeparator()
                + "group: " + student.getGroup() + System.lineSeparator()
                + "date: " + student.getDate());
    }
}
