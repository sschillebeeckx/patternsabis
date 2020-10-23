package be.abis.demo;

public class Wheel implements BaseWheel {
	
	private String wheelName;

	public Wheel(String wheelName){
		this.wheelName=wheelName;
	}
	

	@Override
	public String getWheelName() {
		return wheelName;
	}

	public void setWheelName(String wheelName) {
		this.wheelName = wheelName;
	}


	@Override
	public void turnLeft(double degrees) {
		System.out.println(wheelName + " wheel turning left by " + degrees + " degrees.");		
	}


	@Override
	public void turnRight(double degrees) {
		System.out.println(wheelName + " wheel turning right by " + degrees + " degrees.");				
	}


	@Override
	public void rotate(double kmsPerHour) {
		System.out.println(wheelName + " wheel rotating with " + kmsPerHour + " kms per hour.");					
	}
	
}
	


