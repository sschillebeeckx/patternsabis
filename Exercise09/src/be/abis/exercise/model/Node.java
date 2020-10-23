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

	@Override
	public void draw() {
		System.out.println("drawing node with address: " + this.getAddress());
		System.out.println("drawing a circle");	
	}

}
