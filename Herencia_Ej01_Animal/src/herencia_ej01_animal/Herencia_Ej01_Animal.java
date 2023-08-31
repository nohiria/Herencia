/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package herencia_ej01_animal;

import Entities.Animal;
import Entities.Cat;
import Entities.Dog;
import Entities.Horse;

/**
 *
 * @author nohyv
 */
public class Herencia_Ej01_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal dog1= new Dog("Stich", "raw diet", 3, "Golden Retriever");
        Animal dog2= new Dog("Vito", "dry kibble", 5, "Mongrel");
        Animal cat1= new Cat("Whiskers", "homemade cat food", 1, "Siamese");
        Animal horse1= new Horse("Spirit", "hay", 2, "Arabian");
        
        dog1.feed();
        dog2.feed();
        cat1.feed();
        horse1.feed();
    }
    
}
