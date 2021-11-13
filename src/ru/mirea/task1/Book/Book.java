package ru.mirea.task1.Book;

import java.lang.*;

public class Book {
    private String name;
    private String author;
    private int pages;

    public Book(String n, int p, String a) {
        name = n;
        pages = p;
        author = a;
    }

    public Book(String n, String a) {
        name = n;
        author = a;
        pages = 512;
    }

    public Book() {
        name = "Ruslan and Lydmila";
        pages = 300;
        author = "Pushkin";
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public String getName(String n) {
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String toString() {
        return this.name + ", pages " + this.pages;
    }

    public void ShowBook() {
        System.out.println("Name:" + name + ", " + "Pages:" + pages + ", "+"Author:"+author+ "\n");
    }
}

