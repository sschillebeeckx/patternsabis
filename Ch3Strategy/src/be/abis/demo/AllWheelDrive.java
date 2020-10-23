package be.abis.demo;

public class AllWheelDrive implements DrivingStrategy {
	
	BaseWheel frontLeft;
	BaseWheel frontRight;
	BaseWheel rearLeft;
	BaseWheel rearRight;
	
	public AllWheelDrive(BaseWheel frontLeft, BaseWheel frontRight, BaseWheel rearLeft, BaseWheel rearRight) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
	}



	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.frontLeft.rotate(kmsPerHour);
	    this.frontRight.rotate(kmsPerHour);
	    this.rearLeft.rotate(kmsPerHour);
	    this.rearRight.rotate(kmsPerHour);
	}
	
}
