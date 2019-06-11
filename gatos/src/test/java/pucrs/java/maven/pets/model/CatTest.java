package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pucrs.java.maven.model.Cat;

public class CatTest {
	
	
	@Test
	public void testCatHasName() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield", garfield.getName());
		
	}
	@Test
	public void testCatHasAMeow() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield Whoof!", garfield.meow());
		
	}
}
