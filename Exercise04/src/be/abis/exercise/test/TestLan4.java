package be.abis.exercise.test;

import java.util.List;
import be.abis.exercise.factory.LanFactory;
import be.abis.exercise.factory.LanType;
import be.abis.exercise.factory.PacketFactory;
import be.abis.exercise.factory.PacketType;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.Packet;
import be.abis.exercise.model.WorkStation;

public class TestLan4 {

	public static void main(String[] args) {

		LanFactory lf = LanFactory.createFactory(LanType.SIMPLE);
		List<Node> nodes = lf.createNodes();
		lf.createLan(nodes);

		// Creating a packet...
		Packet aPacket = PacketFactory.createFactory(PacketType.SIMPLE)
				          .createPacket("Jippie, it works !!", "frd555");

		// Find WorkStation abc123
		WorkStation w1 = lf.findWorkstation(nodes, "abc123");

		// Inserting the packet into the network...
		if (w1 != null) {
			w1.originate(aPacket);
		} else {
			System.out.println("packet could not be sent, workstation not known");
		}
	}
}