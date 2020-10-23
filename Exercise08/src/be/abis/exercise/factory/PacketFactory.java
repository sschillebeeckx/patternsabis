package be.abis.exercise.factory;

import be.abis.exercise.model.PacketComponent;

public abstract class PacketFactory {
	
	public static PacketFactory createFactory(PacketType pt) {
		switch (pt) {
		  default :
		  case SIMPLE:
			return SimplePacketFactory.getInstance();
		  case SUPER:
				return SuperPacketFactory.getInstance();
		}
	}
	
	public abstract PacketComponent createPacket(String message,String destination);

}
