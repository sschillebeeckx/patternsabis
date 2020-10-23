package be.abis.exercise.factory;

import be.abis.exercise.model.Packet;

public abstract class PacketFactory {
	
	public static PacketFactory createFactory(PacketType pt) {
		switch (pt) {
		  default :
		  case SIMPLE:
			return SimplePacketFactory.getInstance();	 
		}
	}
	
	public abstract Packet createPacket(String message,String destination);

}
