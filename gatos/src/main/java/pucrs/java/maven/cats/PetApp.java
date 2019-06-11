package pucrs.java.maven.cats;

/**
 * The class GatosApp is pet clinic
 *
 */
public class PetApp 
{
    public static void main( String[] args )
    {
    	PetCatalog pets = new PetCatalog();
    	
    	System.out.println( "Cats!" );
        
        pets.add(new Cat("Garfield"));
        pets.add(new Cat("Tom"));
        pets.add(new Cat("TopCat"));
               
        System.out.println( "Dogs!" );
        
        pets.add(new Dog("Beethoven"));
        pets.add(new Dog("Marley"));
        pets.add(new Dog("Bud"));
        
        pets.doTalk();
        
        
        
    }
}
