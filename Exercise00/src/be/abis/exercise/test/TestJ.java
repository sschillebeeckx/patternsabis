package be.abis.exercise.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import be.abis.exercise.model.Circle;
import be.abis.exercise.model.Point;
import be.abis.exercise.model.Rectangle;
import be.abis.exercise.model.Shape;

public class TestJ {

	private List<Shape> shapeList = new ArrayList<>();	

	@Before
	public void setUp() throws Exception {
		Point p = new Point();
		shapeList.add(new Circle("red",p,2));
		shapeList.add(new Rectangle("blue",p,2,3));
	}

	@Test
	public void testArea() {
		assertEquals(6.0,shapeList.get(1).area(),0.01);		
	}
	
	@Test
	public void testColor() {
		assertEquals("red",shapeList.get(0).getColor());		
	}

}
