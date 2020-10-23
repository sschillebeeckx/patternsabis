package be.abis.exercise.factory;

import be.abis.exercise.model.*;

import java.util.ArrayList;
import java.util.List;

public class SimplePacketFactory extends PacketFactory{
	
	private static SimplePacketFactory instance;

	private SimplePacketFactory(){}

	public static SimplePacketFactory getInstance() {
		if (instance == null) {
			instance = new SimplePacketFactory();
		}
		return instance;
	}

	@Override
	public Packet createPacket(String message, String destination) {
		return new Packet(message,destination);
	}


	public static class SimpleLanFactory extends LanFactory{

		private static SimpleLanFactory instance;

		private SimpleLanFactory(){}

		public static SimpleLanFactory getInstance(){
			if (instance==null){
				instance=new SimpleLanFactory();
			}
			return instance;
		}

		@Override
		public List<Node> createNodes() {
			List<Node> nodes = new ArrayList<Node>();
			nodes.add(new WorkStation("abc123"));
			nodes.add(new Node("jhy903"));
			nodes.add(new PrintServer("fre943",new LaserPrinter()));
			nodes.add(new Node("klm009"));
			nodes.add(new PrintServer("frd555",new ThreeDimensionalPrinter()));
			return nodes;
		}





	}
}
