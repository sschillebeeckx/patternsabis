package be.abis.demo;

public class BillsOf20Dispenser extends BillsDispenser {

	public BillsOf20Dispenser() {
		super(20);
	}

	@Override
	public void handle(int numberOfBills) {
		System.out.println("Dispensing "+numberOfBills+" bills of 20.");		
	}

	

}
