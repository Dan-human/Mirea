package ru.mirea.task2.Author;

public class Author {
    String name;
    String email;
    char gender;


    Author(String name,String email, char gender ){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public String ToString(){
        return this.name+" "+this.gender+" "+this.email;
    }
}