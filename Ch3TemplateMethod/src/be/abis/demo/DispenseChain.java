package be.abis.demo;

public abstract class DispenseChain {
	
	private DispenseChain nextChain;

	public DispenseChain getNextChain() {
		return nextChain;
	}
	
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	public abstract void dispense(Currency cur);

}
