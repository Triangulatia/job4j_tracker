package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error problem = new Error(true, 1, "default problem");
        Error mistake = new Error(false, 2, "mistake");
        error.printInfo();
        problem.printInfo();
        mistake.printInfo();
    }
}
