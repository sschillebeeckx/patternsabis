package be.abis.exercise.model;

import java.util.List;

public class Packet implements PacketComponent{

	private String destinationAddress;
	private String contents;
	private String originAddress;

	public Packet(String contents, String destinationAddress) {
		this.contents = contents;
		this.destinationAddress = destinationAddress;
	}

	public String getContents() {
		return contents;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setContents(String aString) {
		contents = aString;
	}

	public void setDestinationAddress(String anAddress) {
		destinationAddress = anAddress;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}

	@Override
	public void addComponent(PacketComponent pc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeComponent(PacketComponent pc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PacketComponent getComponent(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PacketComponent> getPackets() {
		// TODO Auto-generated method stub
		return null;
	}


}
