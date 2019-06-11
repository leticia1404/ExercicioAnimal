package pucrs.java.maven.cats;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetCatalogTest {

	@Test
	public void testCatCAtalogIsAvailable() {
		PetCatalog cats = new PetCatalog();
		assertNotNull(cats);
	}
	
	@Test
	public void testAddGarfielsIntoCatalog() {
		PetCatalog cats = new PetCatalog();
		Cat garfield = new Cat("Garfield");
		cats.add(garfield);
		
	}
		
	

}
