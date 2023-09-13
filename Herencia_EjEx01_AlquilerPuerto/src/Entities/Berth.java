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
public class Berth {
    private String position;
    private Rental rental;
    
    //Constructors
    public Berth() {
    }

    public Berth(String position, Rental rental) {
        this.position = position;
        this.rental = rental;
    }

    //Getters&Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }
    
    
    
}
