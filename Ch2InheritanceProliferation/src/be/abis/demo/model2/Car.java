package be.abis.demo.model2;

public abstract class Car extends BaseCar {
	
	protected Car(){
		 this.frontLeft = new Wheel("front left");
		 this.frontRight = new Wheel("front right");
		 this.rearLeft = new Wheel("rear left");
		 this.rearRight = new Wheel("rear right");
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
