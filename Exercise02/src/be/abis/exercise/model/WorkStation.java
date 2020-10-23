package be.abis.exercise.model;

public class WorkStation extends Node {

	public WorkStation(String address) {
		super(address);
	}

	public void originate(Packet p) {
		this.send(p);
	}


}
