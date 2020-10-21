package be.abis.exercise.model;

public class Circle extends Shape {

	private double radius;

	public Circle(String color, Point origin, double radius) {
		super(color, origin);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14*radius*radius;
	}
	

}
