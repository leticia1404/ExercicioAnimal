package pucrs.java.maven.framework;

public abstract class Pet {

	private String name;

	public Pet(String name) {
		this.name = name;
	}

	public abstract String talk();
	
	public String getName() {
		
		return name;
	}

}