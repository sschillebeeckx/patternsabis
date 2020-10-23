package be.abis.demo.model1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCars {
	
	private static Car car1;
	private static Car car2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
