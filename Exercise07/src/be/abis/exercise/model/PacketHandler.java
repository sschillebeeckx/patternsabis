package be.abis.exercise.model;

import java.util.ArrayList;
import java.util.List;

import be.abis.exercise.listener.ArrivedListener;
import be.abis.exercise.listener.EventSource;

public abstract class PacketHandler extends Node implements EventSource {
	
	private List<ArrivedListener> listeners = new ArrayList<>();

	public PacketHandler(String address) {
		super(address);
	}
	
	public List<ArrivedListener> getListeners() {
		return listeners;
	}

	public void setListeners(List<ArrivedListener> listeners) {
		this.listeners = listeners;
	}
	
	@Override
	public void addArrivedListener(ArrivedListener cl) {
		listeners.add(cl);		
	}

	@Override
	public void removeArrivedListener(ArrivedListener cl) {
		listeners.remove(cl);		
	}

	public void receive(Packet p) {
		if (this.getAddress().equals(p.getDestinationAddress())) {
			this.handleAndNotify(p);
		} else {
			this.send(p);
		}
	}

	public void handleAndNotify(Packet p){
		this.handle(p);
		this.notifyListenerOffArrival(p);
	}
	
	public abstract void handle(Packet p);

	public void notifyListenerOffArrival(Packet p) {
		for (ArrivedListener list : listeners) {
			if (list.getAddress().equals(p.getOriginAddress())) {
				list.confirm(p.getContents(), this);
			}
		}
	}
	
}
