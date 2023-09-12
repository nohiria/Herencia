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
public class Yacht extends Motorboat{
    private int cabins;
    
    //Constructors
    public Yacht() {
    }

    public Yacht(int cabins, int powerInHP, int registrationNumber, double length, int year) {
        super(powerInHP, registrationNumber, length, year);
        this.cabins = cabins;
    }
    
    //Getters&Setters
    public int getCabins() {
        return cabins;
    }

    public void setCabins(int cabins) {
        this.cabins = cabins;
    }

    @Override
    public String toString() {
        return "Yacht{" + "cabins=" + cabins + '}';
    }
    
    //Methods

    @Override
    public double calculateModuleValue() {
        return super.calculateModuleValue() + cabins;
    }
    
}
