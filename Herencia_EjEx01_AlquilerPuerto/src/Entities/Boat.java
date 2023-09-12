/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author nohyv
 */
public class Boat {
    private int registrationNumber;
    private double length;
    private LocalDate year;
    
    //Constructors
    public Boat() {
    }

    public Boat(int registrationNumber, double length, int year) {
        this.registrationNumber = registrationNumber;
        this.length = length;
        this.year = LocalDate.of(year, 1, 1);
    }
    
    //Getters&Setters
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = LocalDate.of(year, 1, 1);
    }

    @Override
    public String toString() {
        return "Boat{" + "registrationNumber=" + registrationNumber + ", length=" + length + ", year=" + year + '}';
    }
    
    //Methods
    public double calculateModuleValue(){
        return length*10;
    }
}
