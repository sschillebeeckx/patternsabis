package be.abis.exercise.test;

import be.abis.exercise.model.LaserPrinter;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.Packet;
import be.abis.exercise.model.PrintServer;
import be.abis.exercise.model.ThreeDimensionalPrinter;
import be.abis.exercise.model.WorkStation;

public class TestLan2 {

	public static void main(String[] args) {

		// Creating the nodes...
		WorkStation w1 = new WorkStation("abc123");
		Node n2 = new Node("jhy903");
		PrintServer p1 = new PrintServer("fre943",new LaserPrinter());		
		Node n3 = new Node("klm009");
		PrintServer p2 = new PrintServer("frd555",new ThreeDimensionalPrinter());

		// Connecting the nodes...
		w1.setNextComponent(n2);
		n2.setNextComponent(p1);
		p1.setNextComponent(n3);
		n3.setNextComponent(p2);
		p2.setNextComponent(w1);

		// Creating a packet...
		Packet aPacket = new Packet("Jippie, it works !!", "frd555");

		// Inserting the packet into the network...
		w1.originate(aPacket);
	}
}