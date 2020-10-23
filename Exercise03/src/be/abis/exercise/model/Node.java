package be.abis.exercise.model;

public class Node extends LanComponent{

	public Node(String address) {
		super(address);
	}

	public void receive(Packet p) {
		this.send(p);
	}

	public void send(Packet p) {
		this.getNextComponent().receive(p);
	}

}
