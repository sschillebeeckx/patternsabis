package be.abis.demo.model3;

public class FrontWheelDrive implements DrivingBehavior {
	
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
