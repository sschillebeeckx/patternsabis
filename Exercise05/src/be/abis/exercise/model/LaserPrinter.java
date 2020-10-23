package be.abis.exercise.model;

public class LaserPrinter implements PrintingStrategy{

	@Override
	public void print(Packet p) {
		System.out.println(" on a LASER printer");	
	}

}
