package pucrs.java.maven.cats;

import java.util.ArrayList;
import java.util.List;

public class CatCatalog {
	
	private List<Cat> cats = new ArrayList<Cat>();
	
	public void add(Cat cat) {
		cats.add(cat);
		
	}

	public void doMeow() {
		for (Cat cat : cats) {
			System.out.println(cat.meow());
		}
		
	}

}
