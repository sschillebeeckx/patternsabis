package be.abis.demo.model3;

public class Toyota implements Manufacturer {
	
	private static Toyota instance;
	
	private Toyota(){}
	
	public static Toyota getInstance(){
		if (instance==null) instance=new Toyota();
		return instance;
	}

	@Override
	public String getName() {
		return "Toyota";
	}
	
	

}
