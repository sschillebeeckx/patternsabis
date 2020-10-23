package be.abis.exercise.test;

import java.util.ArrayList;
import java.util.List;

import be.abis.exercise.decorator.NodeDecorator;
import be.abis.exercise.decorator.ShadedDecorator;
import be.abis.exercise.decorator.TextDecorator;
import be.abis.exercise.facade.LanFacade;
import be.abis.exercise.factory.LanFactory;
import be.abis.exercise.factory.LanType;
import be.abis.exercise.factory.PacketFactory;
import be.abis.exercise.factory.PacketType;
import be.abis.exercise.listener.ArrivedListener;
import be.abis.exercise.model.Node;
import be.abis.exercise.model.PacketComponent;
import be.abis.exercise.model.PacketHandler;
import be.abis.exercise.model.WorkStation;

public class TestLan9 {

	public static void main(String[] args) {

		LanFactory lf = LanFactory.createFactory(LanType.EXTENDED);
		LanFacade lfac = new LanFacade(lf);
		List<Node> nodes = lfac.constructLan();
		
		
		registerWorkStationsWithPacketHandler(nodes);

		// Creating a packet...
		PacketComponent aPacket = PacketFactory.createFactory(PacketType.SUPER)
				          .createPacket("This is a message from me. Hope you are happy.", "xrz147");

		// Find WorkStation abc123
		WorkStation w1 = lfac.findWorkstation(nodes, "abc123");

		// Inserting the packet into the network...
		if (w1 != null) {
			w1.originate(aPacket);
		} else {
			System.out.println("packet could not be sent, workstation not known");
		}
		
		decoratingTest(nodes);
		
	}
	
	private static void registerWorkStationsWithPacketHandler(List<Node> nodes) {
		List<ArrivedListener> listeners= new ArrayList<>();
		for (Node n : nodes){
			if (n instanceof WorkStation){
				listeners.add((WorkStation)n);
			}
		}
		for (Node n : nodes){
			if (n instanceof PacketHandler){
				for (ArrivedListener al : listeners){
					((PacketHandler) n).addArrivedListener(al);
				}
			}
		}		
	}
	
	public static void decoratingTest(List<Node> nodes) {
		for (int i = 0; i < nodes.size(); i++) {
			System.out.println("--------------------------------------------");
			if (i % 4 == 0) {
				new NodeDecorator(nodes.get(i)).draw();
			} else if (i % 4 == 1) {
				new ShadedDecorator(new NodeDecorator(nodes.get(i))).draw();
			} else if (i % 4 == 2) {
				new TextDecorator(new NodeDecorator(nodes.get(i))).draw();
			} else {
				new ShadedDecorator(new TextDecorator(new NodeDecorator(nodes.get(i)))).draw();
			}
		}
	}
	
}