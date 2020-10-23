package be.abis.exercise.adapter;

import be.abis.exercise.model.Packet;
import be.abis.exercise.model.PacketHandler;
import be.abis.exercise.model.TapeStreamer;

public class TapeStreamerAdapter extends PacketHandler implements Adapter {
	
	private TapeStreamer tapeStreamer;
	
	public TapeStreamerAdapter(String address) {
		super(address);
		//this.tapeStreamer = new TapeStreamer(address);
	}

	public TapeStreamer getTapeStreamer() {
		return tapeStreamer;
	}

	public void setTapeStreamer(TapeStreamer tapeStreamer) {
		this.tapeStreamer = tapeStreamer;
	}

	@Override
	public void handle(Packet p) {
		tapeStreamer.stream(p);
	}
	
	

	

}
