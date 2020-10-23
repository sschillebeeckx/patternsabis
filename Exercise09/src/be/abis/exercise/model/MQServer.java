package be.abis.exercise.model;

public class MQServer extends PacketHandler {


	public MQServer(String anAddress) {
		super(anAddress);
	}

	public void handle(PacketComponent p) {
		System.out.println("I (" + this.getAddress() + ") PUT your message ON A QUEUE: " + p.getContents());
	}

}
