package be.abis.demo.model1;

public class ToyotaCorollaSport extends ToyotaCorolla {
	
	@Override
	public void accelerate(double kmsPerHour) {
		System.out.println("accelerating");
		this.rearLeft.rotate(kmsPerHour);
	    this.rearRight.rotate(kmsPerHour);
	}

}
