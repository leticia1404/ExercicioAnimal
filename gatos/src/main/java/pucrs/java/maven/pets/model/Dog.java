package pucrs.java.maven.pets.model;

import pucrs.java.maven.pets.framework.Pet;

public class Dog extends Pet{
	
	public Dog(String name, Pet.Gender sex) {
		super(name, sex);
		
	}
	
	public String bark() {
		return getName() + " " + "Whoof!";
		
	}

	@Override
	public String talk() {
		return bark();
	}

}
