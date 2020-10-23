package be.abis.demo.model2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCars {
	
	private  Car car1;
	private  Car car2;

	@Before
	public  void setUpBeforeClass() throws Exception {
		car1 = new ToyotaCorolla();	
		car2 = new ToyotaCorollaSport();	
	}

	@Test
	public void testCar1() {
		assertEquals("Toyota",car1.getManufacturer());
	    car1.accelerate(70);
	    car1.turnLeft(90);	    
	}
	
	@Test
	public void testCar2() {
		assertEquals("Toyota",car2.getManufacturer());
	    car2.accelerate(70);
	    car2.turnLeft(90);	    
	}

}
