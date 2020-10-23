package be.abis.demo;

public class Friend implements CelebrationListener {
	
	private String name;

	public Friend(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attendCelebration(CelebrationEvent e) {
		Person celebrator = (Person) e.getSource();
		System.out.println("I will attend your " + e.getReason() + " party on"
				+ e.getDay() + ", " + celebrator.getFirstName() + " "
				+ celebrator.getLastName());
	}
}
