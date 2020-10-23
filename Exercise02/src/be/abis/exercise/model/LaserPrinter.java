package be.abis.exercise.model;

public class LaserPrinter implements PrintingStrategy{

	@Override
	public void print(Packet p) {
		System.out.println("  your message: " + p.getContents() + "on a LASER printer");	
	}

}
