package be.abis.exercise.model;

public class Packet {

	private String destinationAddress;
	private String contents;
	private String originAddress;

	public Packet(String contents, String destinationAddress) {
		this.contents = contents;
		this.destinationAddress = destinationAddress;
	}

	public String getContents() {
		return contents;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setContents(String aString) {
		contents = aString;
	}

	public void setDestinationAddress(String anAddress) {
		destinationAddress = anAddress;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}


}
