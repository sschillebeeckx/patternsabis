package be.abis.demo.model3;

public class Honda implements Manufacturer {
	
	private static Honda instance;
	
	private Honda(){}
	
	public static Honda getInstance(){
		if (instance==null) instance=new Honda();
		return instance;
	}

	@Override
	public String getName() {
		return "Honda";
	}
	
	

}
