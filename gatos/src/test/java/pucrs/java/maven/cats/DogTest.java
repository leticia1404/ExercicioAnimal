package pucrs.java.maven.cats;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {

	@Test
	public void testDogHasAName() {
		Dog beethoven = new Dog("Beethoven");
		assertEquals("Beethoven", beethoven.getName());
	}

	@Test
	public void testDogHasAMeow() {
		Dog beethoven = new Dog("Beethoven");
		assertEquals("beethoven Meow!", beethoven.bark());
	}
	
	
}
