/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Berth;
import Entities.Boat;
import Entities.Motorboat;
import Entities.Rental;
import Entities.Sailboat;
import Entities.Yacht;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class RentalService {
    private final Scanner input;
    private final Berth[][] port;

    public RentalService() {
        input= new Scanner(System.in);
        port= createPort();
    }
    
    //<editor-fold desc="Create Boats Methods">
    private Boat createCommonBoat(){
        System.out.println("Common Boat");
        System.out.println("Enter the registration number");
        int registrationNumber=Integer.parseInt(input.nextLine());
        System.out.println("Enter the length in meters");
        double length= Double.parseDouble(input.nextLine());
        System.out.println("Enter the year of manufacture");
        int yearOfManufacture= Integer.parseInt(input.nextLine());
        return new Boat(registrationNumber, length, yearOfManufacture);
    }
    
    private Sailboat createSailboat(){
        System.out.println("Sailboat");
        System.out.println("Enter the registration number");
        int registrationNumber=Integer.parseInt(input.nextLine());
        System.out.println("Enter the length in meters");
        double length= Double.parseDouble(input.nextLine());
        System.out.println("Enter the year of manufacture");
        int yearOfManufacture= Integer.parseInt(input.nextLine());
        System.out.println("Enter the masts number");
        int masts= Integer.parseInt(input.nextLine());
        return new Sailboat(masts, registrationNumber, length, yearOfManufacture);
    }
    
    private Motorboat createMotorBoat(){
        System.out.println("Motorboat");
        System.out.println("Enter the registration number");
        int registrationNumber=Integer.parseInt(input.nextLine());
        System.out.println("Enter the length in meters");
        double length= Double.parseDouble(input.nextLine());
        System.out.println("Enter the year of manufacture");
        int yearOfManufacture= Integer.parseInt(input.nextLine());
        System.out.println("Enter the power in HP");
        int powerInHP= Integer.parseInt(input.nextLine());
        return new Motorboat(powerInHP, registrationNumber, length, yearOfManufacture);
    }
    
    private Yacht createYacht(){
        System.out.println("Yacht");
        System.out.println("Enter the registration number");
        int registrationNumber=Integer.parseInt(input.nextLine());
        System.out.println("Enter the length in meters");
        double length= Double.parseDouble(input.nextLine());
        System.out.println("Enter the year of manufacture");
        int yearOfManufacture= Integer.parseInt(input.nextLine());
        System.out.println("Enter the power in HP");
        int powerInHP= Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of cabins");
        int cabins= Integer.parseInt(input.nextLine());
        return new Yacht(cabins, powerInHP, registrationNumber, length, yearOfManufacture);
    }
    //</editor-fold>
    
    //<editor-fold desc="Port Methods">
    private Berth[][] createPort(){
        Berth [][] p= new Berth[2][4];
        for(int r=0; r<2; r++){
            for(int c=0; c<4; c++){
                Berth s= new Berth();
                String row= String.valueOf(2-r);
                String area= "";
                switch(c){
                    case 0:
                        area= "S";
                        break;
                    case 1:
                        area= "M";
                        break;
                    case 2:
                        area= "Y";
                        break;
                    case 3:
                        area= "B";
                        break;
                }
                s.setPosition(area+row);
                p[r][c]= s;
            }
        }
        return p;
    }
    
    public void showPort(){
        for (Berth[] row : port) {
            for (Berth berth : row) {
                System.out.print("╔═════╗");
            }
            System.out.println();

            for (Berth berth : row) {
                System.out.print("║");
                if (berth.getRental() != null) {
                    if (berth.getRental().getBoat() instanceof Sailboat) {
                        System.out.print(" S ");
                    } else if (berth.getRental().getBoat() instanceof Motorboat) {
                        System.out.print(" M ");
                    } else if (berth.getRental().getBoat() instanceof Yacht) {
                        System.out.print(" L ");
                    } else {
                        System.out.print(" B ");
                    }
                } else {
                    System.out.print("   ");
                }
                System.out.print("║");
            }
            System.out.println();

            for (Berth berth : row) {
                System.out.print("╚═════╝"); // Borde inferior
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }

    }
    //</editor-fold>

    public void rentalMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("MENU");
            System.out.println("1. Rent a berth");
            System.out.println("2. Show Port");
            System.out.println("3. Show List of Rentals");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    // Rent a berth
                    System.out.println("Renting a Berth");
                    Rental rental = createRent();

                    // Find an available berth
                    Berth availableBerth = findAvailableBerth();

                    if (availableBerth != null) {
                        // Assign the rental to the berth
                        availableBerth.setRental(rental);
                        // Assign the berth position to the rental
                        rental.setPosition(availableBerth.getPosition());
                        System.out.println("Berth rented successfully!");
                    } else {
                        System.out.println("No available berths.");
                    }
                    break;
                case 2:
                    // Show Port
                    showPort();
                    break;
                case 3:
                    // Show List of Rentals
                    showListOfRentals();
                    break;
                case 4:
                    // Exit
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    private Berth findAvailableBerth() {
        for (Berth[] row : port) {
            for (Berth berth : row) {
                if (berth.getRental() == null) {
                    return berth; // Amarre disponible encontrado
                }
            }
        }
        return null; // No se encontraron amarres disponibles
    }

    private void showListOfRentals() {
        // Recorre el puerto y muestra los alquileres asignados a los amarres
        for (Berth[] row : port) {
            for (Berth berth : row) {
                if (berth.getRental() != null) {
                    System.out.println("Berth Position: " + berth.getPosition());
                    System.out.println(berth.getRental().toString());
                    System.out.println("-----------------------------");
                }
            }
        }
    }

    public Rental createRent(){
        System.out.println("Enter your name");
        String name= input.nextLine();
        System.out.println("Enter your ID");
        int id= Integer.parseInt(input.nextLine());
        System.out.println("Enter the start date: yyyy/mm/dd");
        String start= input.nextLine();
        LocalDate startDate= checkDate(start);
        System.out.println(startDate);
        while (startDate==null){
            System.out.println("Enter a valid date");
            start= input.nextLine();
            startDate= checkDate(start);
        }
        System.out.println("Enter the end date: yyyy/mm/dd");
        String end= input.nextLine();
        LocalDate endDate= checkDate(end);
        while(endDate==null && endDate.isBefore(startDate)){
            System.out.println("Enter a valid date");
            end= input.nextLine();
            endDate= checkDate(end);
        }
        
        System.out.println("Select your type of boat");
        System.out.println("1. Common Boat");
        System.out.println("2. Sailboat");
        System.out.println("3. Motorboat");
        System.out.println("4. Yacht");
        int typeOfBoat= Integer.parseInt(input.nextLine());
        while(typeOfBoat<1 && typeOfBoat>4){
            System.out.println("Enter a valid option");
            typeOfBoat= Integer.parseInt(input.nextLine());
        }
        Boat b;
        switch(typeOfBoat){
            case 1:
                b= createCommonBoat();
                break;
            case 2:
                b= createSailboat();
                break;
            case 3:
                b= createMotorBoat();
                break;
            case 4: 
                b= createYacht();
                break;
            default:
                b= null;
                break;
        }
        return new Rental(name, id, startDate, endDate, "", b);
    }
    
    private LocalDate checkDate(String date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        try {
            LocalDate formattedDate = LocalDate.parse(date, dateFormatter);
            return formattedDate;
        } catch (Exception e) {
            System.out.println("Error, make sure the format is correct.");
            return null;
        }
    }

}
