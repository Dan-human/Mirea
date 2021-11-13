package ru.mirea.task1.Ball;

import ru.mirea.task1.Ball.Ball;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1=new Ball("Orange", 2);
        Ball b2=new Ball("Pink",5);
        Ball b3=new Ball("Green");
        b3.setSize(1);
        System.out.println(b1);
        b1.showBall();
        b2.showBall();
        b3.showBall();
    }
}

