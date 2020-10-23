package be.abis.exercise.model;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(){}

    public Rectangle(double height){
        this.height=height;
    }

    public Rectangle(double height, double width) {

        this(height);
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width*height;
    }

    public String toString(){
        String base = super.toString();
        return base + ", height is " + height;
    }
}
