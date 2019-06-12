package pucrs.java.maven.pets.app;

import pucrs.java.maven.pets.framework.Pet;
import pucrs.java.maven.pets.framework.PetCatalog;
import pucrs.java.maven.pets.model.Cat;
import pucrs.java.maven.pets.model.Dog;
import pucrs.java.maven.pets.model.Fish;

/**
 * The class PetsApp is pet clinic
 *
 */
public class PetApp 
{
    public static void main( String[] args )
    {
    	PetCatalog pets = new PetCatalog();
    	
    	System.out.println( "Cats!" );
        
        pets.add(new Cat("Garfield", Pet.Gender.MALE));
        pets.add(new Cat("Tom", Pet.Gender.MALE));
        pets.add(new Cat("Lilly", Pet.Gender.FEMALE));
               
        System.out.println( "Dogs!" );
        
        pets.add(new Dog("Beethoven", Pet.Gender.MALE));
        pets.add(new Dog("Marley", Pet.Gender.MALE));
        pets.add(new Dog("Lassie", Pet.Gender.FEMALE));
        
        System.out.println( "Fish!" );
        
        pets.add(new Fish("Dory", Pet.Gender.FEMALE));
        
        pets.doTalk();
        
        
        
    }
}
