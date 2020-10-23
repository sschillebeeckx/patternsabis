package be.abis.demo.model3;

public interface BaseCar {

	void turnLeft(int degrees);

	void turnright(int degrees);

	void accelerate(double kmsPerHour);
	
	Manufacturer getManufacturer();

}