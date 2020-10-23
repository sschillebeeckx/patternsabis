package be.abis.demo.model3;

public class FrontSteering implements SteeringBehavior {

	BaseWheel frontLeft;
	BaseWheel frontRight;
	
	
	
	public FrontSteering(BaseWheel frontLeft, BaseWheel frontRight) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
	}

	@Override
	public void turnLeft(double degrees) {
		System.out.println("turning left");
		this.frontLeft.turnLeft(degrees);
	    this.frontRight.turnLeft(degrees);
	}

	@Override
	public void turnRight(double degrees) {
		System.out.println("turning right");
		this.frontRight.turnRight(degrees);
	    this.frontLeft.turnRight(degrees);		
	}

}
