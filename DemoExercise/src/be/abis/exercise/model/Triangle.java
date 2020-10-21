package be.abis.exercise.model;

public class Triangle extends Shape {

    private double base;
    private double heigth;

    public Triangle(String color, double base, double heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return base*heigth/2;
    }

    public String toString(){
        String baseString = super.toString();
        return baseString + ", base is" + base;
    }
}
