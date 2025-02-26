package Entities;


public class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (2 * width) + (2*height);
    }

    public double diagonal(){
        //a^2+b^2= c^2
        return Math.sqrt((Math.pow(width, 2) + (Math.pow(height,2))));
    }
}
