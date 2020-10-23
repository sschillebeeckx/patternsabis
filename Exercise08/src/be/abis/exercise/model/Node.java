package be.abis.exercise.model;

public class Node extends LanComponent{

	public Node(String address) {
		super(address);
	}

	public void receive(PacketComponent p) {
		this.send(p);
	}

	public void send(PacketComponent p) {
		this.getNextComponent().receive(p);
	}

}
