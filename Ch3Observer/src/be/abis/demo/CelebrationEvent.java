package be.abis.demo;

import java.util.EventObject;

public class CelebrationEvent extends EventObject {

	private final String reason;

	private final String day;

	public CelebrationEvent(Object source, String r, String d) {
		super(source);
		reason = r;
		day = d;
	}

	public String getReason() {
		return reason;
	}

	public String getDay() {
		return day;
	}

}
