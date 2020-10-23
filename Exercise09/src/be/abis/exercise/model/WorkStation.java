package be.abis.exercise.model;

import be.abis.exercise.listener.ArrivedListener;

public class WorkStation extends Node implements ArrivedListener{

	public WorkStation(String address) {
		super(address);
	}

	public void originate(PacketComponent p) {
		p.setOriginAddress(this.getAddress());
		this.send(p);
	}

	@Override
	public void confirm(String message, PacketHandler ph) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Ok, thanks for confirming that my packet arrived at "+ ph.getAddress() + ". Greetings " + this.getAddress());
	}


}
