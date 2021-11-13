package ru.mirea.task1.Ball;

import java.lang.*;

public class Ball {
    private String color;
    private int size;

    public Ball(String n, int a){
        color = n;
        size = a;
    }
    public Ball(String n){
        color = n;
        size = 5;
    }
    public Ball(){
        color = "Blue";
        size = 3;
    }
    public void setSize(int size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }

    public String toString(){
        return this.color+", size "+this.size;
    }
    public void showBall(){
        System.out.println("Color:"+color+", "+"Size:"+size+"\n");
    }
}