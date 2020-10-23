package be.abis.exercise.model;

public class InktjetPrinter implements PrintingStrategy{

	@Override
	public void print(Packet p) {
		System.out.println("  your message: " + p.getContents() + " on a Inktjet printer");	
	}

}
