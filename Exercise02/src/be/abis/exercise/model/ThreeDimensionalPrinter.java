package be.abis.exercise.model;

public class ThreeDimensionalPrinter implements PrintingStrategy{

	@Override
	public void print(Packet p) {
		System.out.println("  your message: " + p.getContents() + " on a 3D printer");	
	}

}
