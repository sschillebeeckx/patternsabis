package be.abis.exercise.model;

public class ThreeDimensionalPrinter implements PrintingStrategy{

	@Override
	public void print(Packet p) {
		System.out.println(" on a 3D printer");	
	}

}
