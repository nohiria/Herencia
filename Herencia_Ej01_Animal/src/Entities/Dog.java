/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author nohyv
 */
public class Dog extends Animal{
    
    //Constructors
    public Dog() {
    }

    public Dog(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }
}
