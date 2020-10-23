package be.abis.exercise.model;

public class PrintServer extends Node {
	
	private PrintingStrategy ps;

	public PrintServer(String address,PrintingStrategy ps) {
		super(address);
		this.ps=ps;
	}

	public PrintingStrategy getPs() {
		return ps;
	}

	public void setPs(PrintingStrategy ps) {
		this.ps = ps;
	}

	public void receive(Packet p) {
		if (this.getAddress().equals(p.getDestinationAddress())) {
			this.print(p);
		} else {
			this.send(p);
		}
	}
	
	public void print(Packet p) {
		System.out.print("I (" + this.getAddress() + ") PRINTED " ) ;
		ps.print(p);
	}

}
