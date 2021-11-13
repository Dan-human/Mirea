package ru.mirea.task1.Book;

import ru.mirea.task1.Book.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1=new Book("Kniga1", 200,"Author1");
        Book b2=new Book("Kniga2","Author2");
        Book b3=new Book();
        b3.setPages(128);
        System.out.println(b3);
        b1.ShowBook();
        b2.ShowBook();
        b3.ShowBook();
    }
}
