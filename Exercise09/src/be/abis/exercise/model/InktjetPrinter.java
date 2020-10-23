package be.abis.exercise.model;

public class InktjetPrinter implements PrintingStrategy{

	@Override
	public void print(PacketComponent p) {
		System.out.println(" on an INKTJET printer");	
	}

}
