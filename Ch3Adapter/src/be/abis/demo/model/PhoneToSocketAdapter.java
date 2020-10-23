package be.abis.demo.model;

public class PhoneToSocketAdapter implements SocketAdapter{
	
	private Phone phone;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public Volt get220Volt(){
		return phone.get5Volt();
	}
	
}
