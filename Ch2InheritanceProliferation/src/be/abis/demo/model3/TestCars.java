package be.abis.demo.model3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCars {
	
	private  BaseCar car1;
	private  BaseCar car2;

	@Before
	public  void setUpBeforeClass() throws Exception {
		car1 = CarFactory.makeToyotaCorolla();	
		car2 = CarFactory.makeHondaCivicSport();	
	}

	@Test
	public void testCar1() {
		assertEquals("Toyota",car1.getManufacturer().getName());
	    car1.accelerate(70);
	    car1.turnLeft(90);	    
	}
	
	@Test
	public void testCar2() {
		assertEquals("Honda",car2.getManufacturer().getName());
	    car2.accelerate(70);
	    car2.turnLeft(90);	    
	}

}
