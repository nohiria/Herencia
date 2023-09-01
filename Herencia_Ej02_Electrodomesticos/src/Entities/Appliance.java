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
public class Appliance {
    protected double cost;
    protected String color;
    protected char energyConsumption;
    protected double weightKilos;
    
    //Constructors
    public Appliance() {
    }

    public Appliance(double cost, String color, char energyConsumption, double weightKilos) {
        this.cost = cost;
        this.color = color;
        this.energyConsumption= energyConsumption;
        this.weightKilos = weightKilos;
    }
    
    //<editor-fold desc="Getters&Setters">
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeightKilos() {
        return weightKilos;
    }

    public void setWeightKilos(double weightKilos) {
        this.weightKilos = weightKilos;
    } 
    //</editor-fold>
    
    //Methods
    private char checkEneryConsumption(char letter){
        boolean letterIsValid= ((letter>='A' && letter<='F') || (letter>='a' && letter<='f'));
        
        return letterIsValid ? Character.toUpperCase(letter) : 'F';
    }
    
    

    
}
