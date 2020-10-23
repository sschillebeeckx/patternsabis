package be.abis.demo.model;

public class BillsOf20Dispenser extends DispenseChain {

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " bills of 20.");
			if (remainder != 0)
				this.getNextChain().dispense(new Currency(remainder));
		} else {
			this.getNextChain().dispense(cur);
		}
	}

}
