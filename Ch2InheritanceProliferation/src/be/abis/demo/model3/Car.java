package be.abis.demo.model3;

public class Car implements BaseCar {
	
	private BaseWheel frontLeft;
	private BaseWheel frontRight; 
	private BaseWheel rearLeft;
	private BaseWheel rearRight; 	

	private DrivingBehavior driving;
	private SteeringBehavior steering;
	private Manufacturer manufacturer;
	
	
	public Car(BaseWheel frontLeft, BaseWheel frontRight, BaseWheel rearLeft, BaseWheel rearRight,
			DrivingBehavior driving, SteeringBehavior steering, Manufacturer manufacturer) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.driving = driving;
		this.steering = steering;
		this.manufacturer = manufacturer;
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
	public DrivingBehavior getDriving() {
		return driving;
	}
	public void setDriving(DrivingBehavior driving) {
		this.driving = driving;
	}
	public SteeringBehavior getSteering() {
		return steering;
	}
	public void setSteering(SteeringBehavior steering) {
		this.steering = steering;
	}
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public void turnLeft(int degrees){
		this.steering.turnLeft(degrees);
	}
	
	@Override
	public void turnright(int degrees){
		this.steering.turnRight(degrees);
	}
		
	@Override
	public void accelerate(double kmsPerHour) {
		this.driving.accelerate(kmsPerHour);
	}

	
	

}
