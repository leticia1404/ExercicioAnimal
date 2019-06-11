package pucrs.java.maven.model;

import pucrs.java.maven.framework.Pet;

public class Cat extends Pet {

	public Cat(String name) {
		
		super(name);
		
	}
	
	public String meow() {
		return getName() +" "+ "Meow!";
		
	}

	@Override
	public String talk() {
		
		return meow();
	}
	

}
