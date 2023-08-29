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
    private String breed;
    private boolean isTrained;
    
    //Constructor
    public Dog() {
    }

    public Dog(String breed, boolean isTrained, String name, int age, String gender, String habitat, String size) {
        super(name, age, gender, habitat, size);
        this.breed = breed;
        this.isTrained = isTrained;
    }
    
    //Getters&Setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isIsTrained() {
        return isTrained;
    }

    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }
    
    //Methods
    @Override
    public void makeNoise(){
        System.out.println("Woof woof!");
    }
    
}
