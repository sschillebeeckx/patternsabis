package be.abis.exercise.test;

import be.abis.exercise.model.LanComponent;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.Packet;
import be.abis.exercise.model.PrintServer;
import be.abis.exercise.model.WorkStation;

public class TestLan1 {

	public static void main(String[] args) {

		// Creating the nodes...
		LanComponent w1 = new WorkStation("abc123");
		LanComponent n2 = new Node("jhy903");
		LanComponent p1 = new PrintServer("fre943");
		LanComponent n3 = new Node("klm009");
		LanComponent p2 = new PrintServer("frd555");

		// Connecting the nodes...
		w1.setNextComponent(n2);
		n2.setNextComponent(p1);
		p1.setNextComponent(n3);
		n3.setNextComponent(p2);
		p2.setNextComponent(w1);

		// Creating a packet...
		Packet aPacket = new Packet("Jippie, it works !!", "fre943");

		// Inserting the packet into the network...
		if (w1 instanceof WorkStation) {
			((WorkStation)w1).originate(aPacket);
		}

	}
}