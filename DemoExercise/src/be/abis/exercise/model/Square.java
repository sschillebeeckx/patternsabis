package be.abis.exercise.model;

public class Square extends Rectangle {

    public Square(double height) {
        super(height);
    }

    public double area(){
        return this.getHeight()*this.getHeight();
    }
}
