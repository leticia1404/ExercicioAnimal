package pucrs.java.maven.cats;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatCatalogTest {

	@Test
	public void testCatCAtalogIsAvailable() {
		CatCatalog cats = new CatCatalog();
		assertNotNull(cats);
	}
	
	@Test
	public void testAddGarfielsIntoCatalog() {
		CatCatalog cats = new CatCatalog();
		Cat garfield = new Cat("Garfield");
		cats.add(garfield);
		
	}
		
	@Test
	public void testCatHasName() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield", garfield.getName());
		
	}
	@Test
	public void testCatHasAMeow() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield Meow!", garfield.meow());
		
	}

}
