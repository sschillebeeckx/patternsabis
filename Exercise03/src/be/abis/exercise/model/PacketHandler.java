package be.abis.exercise.model;

public abstract class PacketHandler extends Node {

	public PacketHandler(String address) {
		super(address);
	}

	public void receive(Packet p) {
		if (this.getAddress().equals(p.getDestinationAddress())) {
			this.handle(p);
		} else {
			this.send(p);
		}
	}

	public abstract void handle(Packet p);

}
