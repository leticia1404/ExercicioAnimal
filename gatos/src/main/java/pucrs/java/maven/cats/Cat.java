package pucrs.java.maven.cats;

public class Cat {

	private String name;
	
	public Cat(String name) {
		
		super();
		this.name = name;
	}
	
	public String meow() {
		return name +" "+ "Meow!";
		
	}

	public String getName() {
		
		return name;
	}
	

	

}
