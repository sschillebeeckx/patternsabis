package be.abis.exercise.model;

public class FileServer extends PacketHandler {

	public FileServer(String address) {
		super(address);
	}

	public void handle(Packet p) {
		System.out.println("I (" + this.getAddress() + ") SAVED your message: " + p.getContents());
	}

}
