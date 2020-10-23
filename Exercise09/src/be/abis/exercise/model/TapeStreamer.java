package be.abis.exercise.model;

public class TapeStreamer {
	
	private String address;

	public TapeStreamer() {
		super();
	}

	public TapeStreamer(String address) {
		this.address=address;
	}

	public void stream(Packet p) {
		System.out.println("I (" + this.address + ") streamed your message to tape: " + p.getContents());
	}
	
	

	

}
