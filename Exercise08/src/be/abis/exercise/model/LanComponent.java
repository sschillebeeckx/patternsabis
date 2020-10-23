package be.abis.exercise.model;

public abstract class LanComponent {
	
	private String address;
	private LanComponent nextComponent;
	
	public LanComponent(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LanComponent getNextComponent() {
		return nextComponent;
	}

	public void setNextComponent(LanComponent nextComponent) {
		this.nextComponent = nextComponent;
	}
	
	public abstract void send(PacketComponent p);
	public abstract void receive(PacketComponent p);

}
