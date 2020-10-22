package be.abis.exercise.model;

public class PrintServer extends Node {

	public PrintServer(String address) {

		super(address);
	}

	@Override
	public void receive(Packet p) {
		if (this.getAddress().equals(p.getDestinationAddress())) {
			this.print(p);
		} else {
			this.send(p);
		}
	}

	public void print(Packet p) {
		System.out.println("I (" + this.getAddress() + ") PRINTED your message: " 
	                                                               + p.getContents());
	}

}
