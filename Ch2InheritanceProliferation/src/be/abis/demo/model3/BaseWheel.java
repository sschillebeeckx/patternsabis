package be.abis.demo.model3;

public interface BaseWheel {

	String getWheelName();

	void turnLeft(double degrees);

	void turnRight(double degrees);

	void rotate(double kmsPerHour);

}