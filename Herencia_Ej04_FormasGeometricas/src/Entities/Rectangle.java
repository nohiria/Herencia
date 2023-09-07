/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Interfaces.ShapeCalculator;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class Rectangle implements ShapeCalculator{
    private final double base;
    private final double height;
    
    //Constructor
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return base*height;
    }

    @Override
    public double calculatePerimeter() {
        return (base+height)*2;
    }
    
}
