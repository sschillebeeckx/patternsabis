package be.abis.demo.model2;

public abstract class FrontWheelDriveCar extends Car {

	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.frontLeft.rotate(kmsPerHour);
	    this.frontRight.rotate(kmsPerHour);
	}
	
}
