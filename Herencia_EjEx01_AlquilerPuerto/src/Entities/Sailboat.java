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
public class Sailboat extends Boat{
    private int mastsNumber;
    
    //Constructors
    public Sailboat() {
    }

    public Sailboat(int mastsNumber, int registrationNumber, double length, int year) {
        super(registrationNumber, length, year);
        this.mastsNumber = mastsNumber;
    }
    
    //Getters&Setters
    public int getMastsNumber() {
        return mastsNumber;
    }

    public void setMastsNumber(int mastsNumber) {
        this.mastsNumber = mastsNumber;
    }

    @Override
    public String toString() {
        return "Sailboat{" + "mastsNumber=" + mastsNumber + '}';
    }
    
    //Methods

    @Override
    public double calculateModuleValue() {
        return (super.calculateModuleValue()) + mastsNumber;
    }
    
}
