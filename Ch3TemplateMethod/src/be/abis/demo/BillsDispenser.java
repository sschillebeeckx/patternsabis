package be.abis.demo;

public abstract class BillsDispenser extends DispenseChain {
	
	private int value;
	
	public BillsDispenser(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= value){
			int num = cur.getAmount()/value;
			int remainder = cur.getAmount() % value;
			
			this.handle(num);
			
			if(remainder !=0) this.getNextChain().dispense(new Currency(remainder));
		}else{
			this.getNextChain().dispense(cur);
		}
	}

	public abstract void handle(int numberOfBills);



}
