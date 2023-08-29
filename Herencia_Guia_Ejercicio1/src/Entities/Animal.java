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
public class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected String habitat;
    protected String size;
    
    //Constructors
    public Animal() {
    }

    public Animal(String name, int age, String gender, String habitat, String size) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
        this.size = size;
    }
    
    //Getters&Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //Methods
    public void makeNoise(){
        System.out.println("Hola!");
    }
}
