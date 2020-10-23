package be.abis.demo;

public class BillsOf50Dispenser extends BillsDispenser {

	public BillsOf50Dispenser() {
		super(50);
	}

	@Override
	public void handle(int numberOfBills) {
		System.out.println("Dispensing "+numberOfBills+" bills of 50.");		
	}
	


}
