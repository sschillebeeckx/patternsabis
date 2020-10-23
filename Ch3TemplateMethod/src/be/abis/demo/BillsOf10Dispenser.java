package be.abis.demo;

public class BillsOf10Dispenser extends BillsDispenser {

	public BillsOf10Dispenser() {
		super(10);
	}

	@Override
	public void handle(int numberOfBills) {
		System.out.println("Dispensing "+numberOfBills+" bills of 10.");		
	}

}
