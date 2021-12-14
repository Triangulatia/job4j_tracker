package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book dumas = new Book("The Three Musketeers", 500);
        Book code = new Book("Clean code", 150);
        Book stevenson = new Book("Strange Case of Dr Jekyll and Mr Hyde", 400);
        Book bradbury = new Book("Frost and Fire", 50);
        Book[] books = new Book[4];
        books[0] = dumas;
        books[1] = code;
        books[2] = stevenson;
        books[3] = bradbury;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Book: " + books[index].getName() + " pages: " + books[index].getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Book: " + books[index].getName() + " pages: " + books[index].getPages());
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println("Book: " + books[index].getName() + " pages: " + books[index].getPages());
            }
        }
    }
}
