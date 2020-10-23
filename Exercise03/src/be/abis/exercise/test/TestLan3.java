package be.abis.exercise.test;

import be.abis.exercise.model.FileServer;
import be.abis.exercise.model.LaserPrinter;
import be.abis.exercise.model.MQServer;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.Packet;
import be.abis.exercise.model.PrintServer;
import be.abis.exercise.model.ThreeDimensionalPrinter;
import be.abis.exercise.model.WorkStation;

public class TestLan3 {

	public static void main(String[] args) {

		// Creating the nodes...
		WorkStation w1 = new WorkStation("abc123");
		PrintServer p1 = new PrintServer("fre943",new LaserPrinter());	
		Node n2 = new Node("jhy903");
		FileServer f1 = new FileServer("sdt287");
		Node n3 = new Node("klm009");
		PrintServer p2 = new PrintServer("frd555",new ThreeDimensionalPrinter());
		FileServer f2 = new FileServer("alk309");
		MQServer m1 = new MQServer("jkl456");

		// Connecting the nodes...
		w1.setNextComponent(p1);
		p1.setNextComponent(n2);
		n2.setNextComponent(f1);
		f1.setNextComponent(n3);
		n3.setNextComponent(p2);
		p2.setNextComponent(f2);
		f2.setNextComponent(m1);
		m1.setNextComponent(w1);

		// Creating a packet...
		Packet aPacket = new Packet("Jippie, it works !!", "jkl456");

		// Inserting the packet into the network...
		w1.originate(aPacket);
	}
}