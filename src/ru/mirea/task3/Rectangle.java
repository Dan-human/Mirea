package ru.mirea.task3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.width = 12;
        this.length = 5;
        this.color = "Blue";
        this.filled = true;
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
        this.color = "Blue";
        this.filled = true;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return width * length;
    }

    public double getPerimeter()
    {
        return (width + length) * 2;
    }


    public String toString()
    {
        return ("Rectangle: width - " + width + ", length - " + length + ", color - " + color + ", filled - " + filled);
    }
}
