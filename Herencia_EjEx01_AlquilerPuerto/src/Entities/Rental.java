/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author nohyv
 */
public class Rental {
    private String customerName;
    private int customerID;
    private LocalDate startDate;
    private LocalDate endDate;
    private int position;
    private Boat boat;
    
    //Constructors
    public Rental() {
    }

    public Rental(String customerName, int customerID, LocalDate startDate, LocalDate endDate, int position, Boat boat) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
        this.boat = boat;
    }
    
    //Getters&Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Rental{" + "customerName=" + customerName + ", customerID=" + customerID + ", startDate=" + startDate + ", endDate=" + endDate + ", position=" + position + ", boat=" + boat + '}';
    }

    //Methods
    public double calculateFinalRentalPrice(){
        Period p=Period.between(startDate, endDate);
        int days= p.getDays();
        return days * this.boat.calculateModuleValue();
    }
}
