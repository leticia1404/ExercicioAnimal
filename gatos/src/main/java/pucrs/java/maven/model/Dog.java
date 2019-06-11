package pucrs.java.maven.model;

import pucrs.java.maven.framework.Pet;

public class Dog extends Pet{

	
	public Dog(String name) {
		
		super(name);
		
	}
	
	public String bark() {
		return getName() +" "+ "Whoof!";
		
	}

	@Override
	public String talk() {
		
		return bark();
	}
	

	

}
