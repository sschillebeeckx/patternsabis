package be.abis.exercise.model;

import java.util.List;

public interface PacketComponent {
	
	void addComponent(PacketComponent pc);
	void removeComponent(PacketComponent pc);
	PacketComponent getComponent(int i);
	List<PacketComponent> getPackets();
	
	String getDestinationAddress();
	void setOriginAddress(String address);
	String getOriginAddress();
	String getContents();

}
