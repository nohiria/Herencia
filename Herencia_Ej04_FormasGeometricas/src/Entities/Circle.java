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
public class Circle implements ShapeCalculator{
    private final double radio;
    
    //Constructor
    public Circle(double radio) {
        this.radio= radio;
    }
    
    @Override
    public double calculateArea() {
        return PI*radio*radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radio;
    }
    
}
