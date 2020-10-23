package be.abis.exercise.adapter;

import be.abis.exercise.model.Packet;
import be.abis.exercise.model.PacketComponent;
import be.abis.exercise.model.PacketHandler;
import be.abis.exercise.model.TapeStreamer;

public class TapeStreamerAdapter extends PacketHandler {
	
	private TapeStreamer tapeStreamer;
	
	public TapeStreamerAdapter(String address) {
		super(address);
		this.tapeStreamer = new TapeStreamer(address);
	}

	@Override
	public void handle(PacketComponent p) {
		tapeStreamer.stream(new Packet(p.getContents(),p.getDestinationAddress()));
	}
	
	

	

}
