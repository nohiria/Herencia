/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDate;

/**
 *
 * @author nohyv
 */
public class Motorboat extends Boat{
    private int powerInHP;
    
    //Constructors
    public Motorboat() {
    }

    public Motorboat(int powerInHP, int registrationNumber, double length, int year) {
        super(registrationNumber, length, year);
        this.powerInHP = powerInHP;
    }
    
    //Getters&Setters
    public int getPowerInHP() {
        return powerInHP;
    }

    public void setPowerInHP(int powerInHP) {
        this.powerInHP = powerInHP;
    }

    @Override
    public String toString() {
        return "Motorboat{" + "powerInHP=" + powerInHP + '}';
    }
    
    //Methods

    @Override
    public double calculateModuleValue() {
        return (super.calculateModuleValue()) + powerInHP;
    }
    
}
