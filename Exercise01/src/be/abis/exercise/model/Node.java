package be.abis.exercise.model;

public class Node extends LanComponent {

	public Node(String address) {
		super(address);
	}

	public void receive(Packet p) {
		System.out.println("I am a node, so I just send");
		this.send(p);
	}

	public void send(Packet p) {
		this.getNextComponent().receive(p);
	}

}
