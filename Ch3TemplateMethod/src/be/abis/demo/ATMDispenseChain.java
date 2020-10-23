package be.abis.demo;

public class ATMDispenseChain {

	public static void main(String[] args) {
		// initialize the chain
		DispenseChain c1 = new BillsOf50Dispenser();
		DispenseChain c2 = new BillsOf20Dispenser();
		DispenseChain c3 = new BillsOf10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
		int amount = 180;

		if (amount % 10 != 0) {
			System.out.println("Amount should be a multiple of 10.");
		} else {
			// process the request
			c1.dispense(new Currency(amount));
		}

	}

}
