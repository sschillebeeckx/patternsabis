package be.abis.demo.model;

public class BillsOf50Dispenser extends DispenseChain {

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 50) {
			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispensing " + num + " bills of 50.");
			if (remainder != 0)
				this.getNextChain().dispense(new Currency(remainder));
		} else {
			this.getNextChain().dispense(cur);
		}
	}

}
