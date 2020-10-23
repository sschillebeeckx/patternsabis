package be.abis.demo;

public class FrontWheelDrive implements DrivingStrategy {
	
	BaseWheel frontLeft;
	BaseWheel frontRight;
	
	public FrontWheelDrive(BaseWheel frontLeft, BaseWheel frontRight) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
	}



	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.frontLeft.rotate(kmsPerHour);
	    this.frontRight.rotate(kmsPerHour);
	}
	
}
