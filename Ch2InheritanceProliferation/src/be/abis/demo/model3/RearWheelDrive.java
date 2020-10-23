package be.abis.demo.model3;

public class RearWheelDrive implements DrivingBehavior {

	BaseWheel rearLeft;
	BaseWheel rearRight;
	
	
	public RearWheelDrive(BaseWheel rearLeft, BaseWheel rearRight) {
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
	}


	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.rearLeft.rotate(kmsPerHour);
	    this.rearRight.rotate(kmsPerHour);
	}
	
}
