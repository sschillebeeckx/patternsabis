package be.abis.demo.model;

public class Socket {

	public Volt get220Volt(){
		return new Volt(220);
	}
	
	public void pluginPhone(SocketAdapter sa){
		System.out.println("charging with " + sa.get220Volt().getVolts() + " volts.");
	}
}
