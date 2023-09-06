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
public class Television extends Appliance{
    private int screenSize;
    private boolean tdtTuner;
    
    //Constructors
    public Television() {
    }

    public Television(int screenSize, boolean tdtTuner, String color, char energyConsumption, double weightKilos) {
        super(color, energyConsumption, weightKilos);
        this.screenSize = screenSize;
        this.tdtTuner = tdtTuner;
    }
    
    //Getters&Setters
    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean hasTdtTuner() {
        return tdtTuner;
    }

    public void setTdtTuner(boolean tdtTuner) {
        this.tdtTuner = tdtTuner;
    }
    
    //Methods
    public void createTelevision(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("TELEVISION");
        super.createAppliance();
        System.out.println("Enter the screen size in inches");
        setScreenSize(Integer.parseInt(input.nextLine()));
        System.out.println("Does it have a freeview tuner? (Y/N)");
        char response= input.nextLine().toUpperCase().charAt(0);
        while(response!='Y' && response!='N'){
            System.out.println("Enter a valid character");
            response= input.nextLine().toUpperCase().charAt(0);
        }
        if(response=='Y'){
            setTdtTuner(true);
        }else{
            setTdtTuner(false);
        }
        setPrice(finalPrice());
    }
    
    private double finalPrice(){
        double finalPrice= super.getPrice();
        
        if(this.screenSize>40){
            finalPrice+= finalPrice*0.3;
        }
        
        if(this.hasTdtTuner()){
            finalPrice+= 500;
        }
        
        return finalPrice;
    }
}
