package be.abis.exercise.model;

public class PrintServer extends PacketHandler {
	
private PrintingStrategy ps;

	public PrintServer(String address,PrintingStrategy ps) {
		super(address);
		this.ps=ps;
	}

	
	public void print(Packet p) {
		System.out.print("I (" + this.getAddress() + ") PRINTED your message: " + p.getContents()) ;
		ps.print(p);
	}

	@Override
	public void handle(Packet p) {
		this.print(p);
	}

}
