package pucrs.java.maven.pets.app;

import static org.junit.Assert.*;

import org.junit.Test;

import pucrs.java.maven.framework.PetCatalog;
import pucrs.java.maven.model.Cat;

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
