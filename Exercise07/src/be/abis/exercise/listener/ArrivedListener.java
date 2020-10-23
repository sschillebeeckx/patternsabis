package be.abis.exercise.listener;

import be.abis.exercise.model.PacketHandler;

public interface ArrivedListener {
	
    public String getAddress();
	void confirm(String message, PacketHandler ph);
}
