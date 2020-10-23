package be.abis.exercise.test;

import java.util.List;

import be.abis.exercise.facade.LanFacade;
import be.abis.exercise.factory.LanFactory;
import be.abis.exercise.factory.LanType;
import be.abis.exercise.factory.PacketFactory;
import be.abis.exercise.factory.PacketType;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.Packet;
import be.abis.exercise.model.WorkStation;

public class TestLan6 {

	public static void main(String[] args) {

		LanFactory lf = LanFactory.createFactory(LanType.EXTENDED);
		LanFacade lfac = new LanFacade(lf);
		List<Node> nodes = lfac.constructLan();

		// Creating a packet...
		Packet aPacket = PacketFactory.createFactory(PacketType.SIMPLE)
				          .createPacket("Jippie, it works !!", "xrz147");

		// Find WorkStation abc123
		WorkStation w1 = lfac.findWorkstation(nodes, "abc123");

		// Inserting the packet into the network...
		if (w1 != null) {
			w1.originate(aPacket);
		} else {
			System.out.println("packet could not be sent, workstation not known");
		}
	}
}