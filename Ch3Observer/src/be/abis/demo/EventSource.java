package be.abis.demo;

public interface EventSource {

	void addCelebrationListener(CelebrationListener cl);

	void removeCelebrationListener(CelebrationListener cl);

}