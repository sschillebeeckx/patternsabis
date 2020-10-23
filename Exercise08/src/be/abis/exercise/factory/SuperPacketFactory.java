package be.abis.exercise.factory;

import be.abis.exercise.model.Packet;
import be.abis.exercise.model.PacketComponent;
import be.abis.exercise.model.SuperPacket;

public class SuperPacketFactory extends PacketFactory{
	
	private static SuperPacketFactory instance;

	private SuperPacketFactory(){}

	public static SuperPacketFactory getInstance() {
		if (instance == null) {
			instance = new SuperPacketFactory();
		}
		return instance;
	}

	@Override
	public PacketComponent createPacket(String message, String destination) {
		String[] sentences = message.split("\\.");
		PacketComponent pc = new SuperPacket(destination);
		for (String s:sentences){
			SuperPacket sp=new SuperPacket(destination);
			String[] words=s.split("\\s");
			for (String word: words){
				word=word.trim();
				PacketComponent p = new Packet(word,destination);
				sp.addComponent(p);
			}
			pc.addComponent(sp);
		}
		return pc;
	}
	
	
}
