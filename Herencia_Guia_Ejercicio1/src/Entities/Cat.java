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
public class Cat extends Animal{
    private boolean isLazy;
    
    //Constructors
    public Cat() {
    }

    public Cat(boolean isLazy, String name, int age, String gender, String habitat, String size) {
        super(name, age, gender, habitat, size);
        this.isLazy = isLazy;
    }
    
    //Getters&Setters
    public boolean isIsLazy() {
        return isLazy;
    }

    public void setIsLazy(boolean isLazy) {
        this.isLazy = isLazy;
    }
    
    //Methods
    @Override
    public void makeNoise(){
        System.out.println("Meow meow!");
    }
}
