package be.abis.demo.model1;

public class Wheel {
	
	private String wheelName;

	public Wheel(String wheelName){
		this.wheelName=wheelName;
	}
	
	public String getWheelName() {
		return wheelName;
	}

	public void setWheelName(String wheelName) {
		this.wheelName = wheelName;
	}

	public void turnLeft(double degrees) {
		System.out.println(wheelName + " wheel turning left by " + degrees + " degrees.");		
	}

	public void turnRight(double degrees) {
		System.out.println(wheelName + " wheel turning right by " + degrees + " degrees.");				
	}

	public void rotate(double kmsPerHour) {
		System.out.println(wheelName + " wheel rotating with " + kmsPerHour + " kms per hour.");					
	}
	
}
	


