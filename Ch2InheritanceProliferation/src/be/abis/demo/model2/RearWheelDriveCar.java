package be.abis.demo.model2;

public abstract class RearWheelDriveCar extends Car {

	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.rearLeft.rotate(kmsPerHour);
	    this.rearRight.rotate(kmsPerHour);
	}
	
}
