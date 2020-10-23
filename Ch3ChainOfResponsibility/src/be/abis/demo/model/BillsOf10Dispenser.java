package be.abis.demo.model;

public class BillsOf10Dispenser extends DispenseChain {
	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 10) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " bills of 10.");
			if (remainder != 0)
				this.getNextChain().dispense(new Currency(remainder));
		} else {
			this.getNextChain().dispense(cur);
		}
	}

}
