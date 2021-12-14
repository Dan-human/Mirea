package ru.mirea.task3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "x1 = " + topLeft.x + " y1 = " + topLeft.y + " xSpeed = " + topLeft.xSpeed + " ySpeed = " + topLeft.ySpeed+
                "\n" + "x2 = " + bottomRight.x + " y2 = " + bottomRight.y + " xSpeed = " + bottomRight.xSpeed + " ySpeed = "
                + bottomRight.ySpeed;
    }

    private boolean equalSpeed(){
        if(topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        }
        else{
            return false;
        }
    }
    public void moveUp() {
        if(equalSpeed()){
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
        else{
            System.out.println("Speed is not equal");
        }

    }

    public void moveDown() {
        if(equalSpeed()){
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
        else{
            System.out.println("Speed is not equal");
        }

    }

    public void moveLeft() {
        if(equalSpeed()){
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
        else{
            System.out.println("Speed is not equal");
        }

    }

    public void moveRight() {
        if(equalSpeed()){
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
        else{
            System.out.println("Speed is not equal");
        }

    }
}