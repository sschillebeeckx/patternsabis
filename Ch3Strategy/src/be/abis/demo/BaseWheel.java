package be.abis.demo;

public interface BaseWheel {

	String getWheelName();

	void turnLeft(double degrees);

	void turnRight(double degrees);

	void rotate(double kmsPerHour);

}