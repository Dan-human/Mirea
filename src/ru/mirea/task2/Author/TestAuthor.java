package ru.mirea.task2.Author;

import ru.mirea.task2.Author.Author;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Oleg", "oleg.vsemprivet@ogo.ru", 'm');
        System.out.println(a1.getName()+" "+a1.getGender()+" "+a1.getEmail());
        a1.setEmail("neoleg.vsempoka@ogo.ru");
        System.out.println();
        System.out.println(a1.ToString());
    }
}
