/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class Appliance {
    protected double price;
    protected String color;
    protected char energyConsumption;
    protected double weightKilos;
    
    //Constructors
    public Appliance() {
    }

    public Appliance(String color, char energyConsumption, double weightKilos) {
        this.color = checkColor(color);
        this.energyConsumption= checkEneryConsumption(energyConsumption);
        this.weightKilos = checkWeight(weightKilos);
        this.price = finalPrice();
    }
    
    //<editor-fold desc="Getters&Setters">
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = checkColor(color);
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = checkEneryConsumption(energyConsumption);
    }

    public double getWeightKilos() {
        return weightKilos;
    }

    public void setWeightKilos(double weightKilos) {
        this.weightKilos = checkWeight(weightKilos);
    } 
    //</editor-fold>
    
    //Methods
    private char checkEneryConsumption(char letter){
        boolean letterIsValid= ((letter>='A' && letter<='F') || (letter>='a' && letter<='f'));
        
        return letterIsValid ? Character.toUpperCase(letter) : 'F';
    }
    
    private String checkColor(String color){
        boolean colorIsValid= (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("gray"));
        
        return colorIsValid ? color : "white";
    }
    
    private double checkWeight(double weight){
        if(weight>1 && weight<200){
            return weight;
        }
        return 50;
    }
    
    public void createAppliance(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Creating Appliance:");
        System.out.println("--------------------------");
        
        System.out.print("Enter the weight (in Kg): ");
        double weight= input.nextDouble();
        while (weight<1 && weight >200){
            System.out.print("Enter a valid weight: ");
            weight = input.nextDouble();
        }
        setWeightKilos(weight);
        System.out.print("Enter the color: ");
        setColor(input.nextLine());
        System.out.print("Enter the energy consumption (A to F): ");
        setEnergyConsumption(input.nextLine().charAt(0));
        setPrice(finalPrice());
    }
    
    private double finalPrice(){
        double finalPrice= 0;
        
        switch(this.energyConsumption){
            case 'A':
                finalPrice= 1000;
                break;
            case 'B':
                finalPrice= 800;
                break;
            case 'C':
                finalPrice= 600;
                break;
            case 'D':
                finalPrice= 500;
                break;
            case 'E':
                finalPrice= 300;
                break;
            case 'F':
                finalPrice= 100;
                break;
        }
        
        if(this.weightKilos>=1 && this.weightKilos<20){
            finalPrice+=100;
        }else if(this.weightKilos>=20 && this.weightKilos<50){
            finalPrice+=500;
        }else if(this.weightKilos>=50 && this.weightKilos<80){
            finalPrice+= 800;
        }else if(this.weightKilos>=80){
            finalPrice+= 1000;
        }
        
        return finalPrice;
    }
    
}
