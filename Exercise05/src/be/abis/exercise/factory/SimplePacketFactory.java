package be.abis.exercise.factory;

import be.abis.exercise.model.Packet;

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
	
	
}
