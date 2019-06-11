package pucrs.java.maven.cats;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
