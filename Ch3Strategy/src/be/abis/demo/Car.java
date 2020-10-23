package be.abis.demo;

public class Car implements BaseCar {
	
	private BaseWheel frontLeft;
	private BaseWheel frontRight; 
	private BaseWheel rearLeft;
	private BaseWheel rearRight; 	

	private DrivingStrategy driving;
	
	public Car(BaseWheel frontLeft, BaseWheel frontRight, BaseWheel rearLeft, BaseWheel rearRight,
			DrivingStrategy driving) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.driving = driving;
	}
	
	public BaseWheel getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(BaseWheel frontLeft) {
		this.frontLeft = frontLeft;
	}
	public BaseWheel getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(BaseWheel frontRight) {
		this.frontRight = frontRight;
	}
	public BaseWheel getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(BaseWheel rearLeft) {
		this.rearLeft = rearLeft;
	}
	public BaseWheel getRearRight() {
		return rearRight;
	}
	public void setRearRight(BaseWheel rearRight) {
		this.rearRight = rearRight;
	}
	public DrivingStrategy getDriving() {
		return driving;
	}
	public void setDriving(DrivingStrategy driving) {
		this.driving = driving;
	}
		
	@Override
	public void accelerate(double kmsPerHour) {
		this.driving.accelerate(kmsPerHour);
	}

	
	

}
