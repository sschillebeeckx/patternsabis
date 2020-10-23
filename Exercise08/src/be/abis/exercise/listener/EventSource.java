package be.abis.exercise.listener;

public interface EventSource {

	void addArrivedListener(ArrivedListener cl);

	void removeArrivedListener(ArrivedListener cl);
}
