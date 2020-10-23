package be.abis.demo.model2;

public abstract class AllWheelDriveCar extends Car {

	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.frontLeft.rotate(kmsPerHour);
	    this.frontRight.rotate(kmsPerHour);
	    this.rearLeft.rotate(kmsPerHour);
	    this.rearRight.rotate(kmsPerHour);
	}
	
}
