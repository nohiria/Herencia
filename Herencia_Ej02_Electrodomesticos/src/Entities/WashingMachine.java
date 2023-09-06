/*
 * To change this license header, choose Liense Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class WashingMachine extends Appliance{
    private double loadCapacity;
    
    //Constructors
    public WashingMachine() {
    }

    public WashingMachine(double loadCapacity, String color, char energyConsumption, double weightKilos) {
        super(color, energyConsumption, weightKilos);
        this.loadCapacity = loadCapacity;
    }
    
    //Getter&Setters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    //Methods
    public void createWashingMachine(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("WASHING MACHINE");
        super.createAppliance();
        System.out.println("Enter the loud capacity");
        setLoadCapacity(input.nextDouble());
        super.setPrice(finalPrice());
    }
    
    private double finalPrice(){
        double finalPrice= super.getPrice();
        
        if(this.loadCapacity>30){
            finalPrice+=500;
        }
        
        return finalPrice;
    }
}
