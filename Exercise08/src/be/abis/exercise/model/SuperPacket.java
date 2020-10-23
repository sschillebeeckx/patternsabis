package be.abis.exercise.model;

import java.util.ArrayList;
import java.util.List;

public class SuperPacket implements PacketComponent {

	private List<PacketComponent> packets = new ArrayList<>();
	private String destinationAddress;
	private String originAddress;

	public SuperPacket(String destinationAddress) {
		this.setDestinationAddress(destinationAddress);
	}

	@Override
	public void addComponent(PacketComponent pc) {
		packets.add(pc);
	}

	@Override
	public void removeComponent(PacketComponent pc) {
		packets.remove(pc);
	}

	@Override
	public PacketComponent getComponent(int i) {
		return packets.get(i);
	}

	@Override
	public void setOriginAddress(String address) {
		this.originAddress = address;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	@Override
	public String getContents() {
		StringBuilder sb = new StringBuilder("");
		for (PacketComponent pc : packets) {
			if (pc instanceof Packet) {
				sb.append(pc.getContents() + " ");
			} else {
				List<PacketComponent> subcomp = pc.getPackets();
				for (PacketComponent p : subcomp) {
					if (p instanceof Packet) {
						sb.append(p.getContents() + " ");
					} else {
						p.getContents();
					}
				}
				sb.append(".");
			}
		}
		return sb.toString();
	}

	public List<PacketComponent> getPackets() {
		return packets;
	}

	public void setPackets(List<PacketComponent> packets) {
		this.packets = packets;
	}

}
