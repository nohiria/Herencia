/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_ejercicio1;

import Entities.Animal;
import Entities.Cat;
import Entities.Dog;
import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class Guia_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animalsList= new ArrayList<>();
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Cat();
        
        animalsList.add(a);
        animalsList.add(b);
        animalsList.add(c);
        
        animalsList.forEach((animal) -> {
            animal.makeNoise();
        });
    }
    
}
