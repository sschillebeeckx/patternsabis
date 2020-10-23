package be.abis.exercise.adapter;

import be.abis.exercise.model.Packet;
import be.abis.exercise.model.TapeStreamer;

public interface Adapter {
    public void handle(Packet p);
    public void setTapeStreamer(TapeStreamer tapeStreamer);
}
