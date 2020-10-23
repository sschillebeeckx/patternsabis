package be.abis.demo.model;

public class CompositeClient {

	public static void main(String[] args) {
		Employee emp1 = new Developer("John", 1300);
		Employee emp2 = new Developer("David", 1500);
		Employee manager1 = new Manager("Daniel", 2800);
		manager1.add(emp1);
		manager1.add(emp2);
		Employee emp3 = new Developer("Kate", 2000);
		Manager generalManager = new Manager("Mark", 5000);
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}

}
