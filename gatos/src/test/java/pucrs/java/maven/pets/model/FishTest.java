package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pucrs.java.maven.pets.framework.Pet;

public class FishTest {
	Fish dory;
	
	@Before
	public void setup() {
		dory = new Fish("Dory", Pet.Gender.MALE);
	}
	
	@Test
	public void testFishHasAName() {
		assertEquals("Dory", dory.getName());
		
	}
	
	@Test
	public void testFishHasASex() {
		assertEquals(Pet.Gender.MALE, dory.getSex());
		
	}
	
	@Test
	public void testFishHasAGlub() {
		assertEquals("Dory Glub!", dory.glub());
		
	}
}
