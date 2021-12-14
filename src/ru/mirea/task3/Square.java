package ru.mirea.task3;

public class Square extends Rectangle {
    public Square()
    {
        this.width = 5;
        this.length = 5;
        this.color = "Pink";
        this.filled = true;
    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
        this.color = "Pink";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override

    public String toString(){
        return ("Square: width - " + width +", color - " + color + ", filled - " + filled);
    }
}
