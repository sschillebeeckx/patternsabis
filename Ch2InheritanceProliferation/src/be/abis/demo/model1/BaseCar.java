package be.abis.demo.model1;

public abstract class BaseCar {
	
	public Wheel frontLeft;
	public Wheel frontRight; 
	public Wheel rearLeft;
	public Wheel rearRight; 
	
	public String manufacturer;

	public Wheel getFrontLeft() {
		return frontLeft;
	}
	protected void setFrontLeft(Wheel frontLeft) {
		this.frontLeft = frontLeft;
	}
	public Wheel getFrontRight() {
		return frontRight;
	}
	protected void setFrontRight(Wheel frontRight) {
		this.frontRight = frontRight;
	}
	public Wheel getRearLeft() {
		return rearLeft;
	}
	protected void setRearLeft(Wheel rearLeft) {
		this.rearLeft = rearLeft;
	}
	public Wheel getRearRight() {
		return rearRight;
	}
	protected void setRearRight(Wheel rearRight) {
		this.rearRight = rearRight;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	
	public abstract void turnLeft(double degrees);
	
	public abstract void turnRight(double degrees);
	
	public abstract void accelerate(double kmsPerHour);
	
	

}
