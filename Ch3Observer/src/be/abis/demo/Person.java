package be.abis.demo;

import java.util.ArrayList;

public class Person implements EventSource {

	String lastName;
	String firstName;

	private final ArrayList<CelebrationListener> listeners = new ArrayList<CelebrationListener>();

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	@Override
	public void addCelebrationListener(CelebrationListener cl) {
		listeners.add(cl);
	}


	@Override
	public void removeCelebrationListener(CelebrationListener cl) {
		listeners.remove(cl);
	}

	void notifyCelebrationComingUp(String reason, String date) {
		CelebrationEvent ce = new CelebrationEvent(this, reason, date);
		for (CelebrationListener cl : listeners) {
			cl.attendCelebration(ce);
		}

	}

}
