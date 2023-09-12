/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package herencia_ejex01_alquilerdebarcos;

import Entities.Boat;
import Entities.Motorboat;
import Entities.Sailboat;
import Entities.Yacht;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class Herencia_EjEx01_AlquilerDeBarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Boat> boatsList= new ArrayList<>();
        
        Boat boat1= new Boat(892182, 5, 2001);
        Boat boat2= new Boat(167829, 6, 2001);
        Sailboat sailboat1= new Sailboat(2, 189182, 8, 2000);
        Motorboat motorboat1= new Motorboat(15, 927381, 6, 2012);
        Motorboat motorboat2= new Motorboat(15, 123389, 7, 2005);
        Yacht yacht1= new Yacht(1, 15, 120922, 10, 1998);
        
        boatsList.add(boat1);
        boatsList.add(boat2);
        boatsList.add(sailboat1);
        boatsList.add(motorboat1);
        boatsList.add(motorboat2);
        boatsList.add(yacht1);
        
        
        
    }
    
    public static void showMenu(){
        System.out.println("Rent a Boat");
        System.out.println("Choose a type of boat for rent");
        System.out.println("1. Common boat");
        System.out.println("2. Sailboat");
        System.out.println("3. Motorboat");
        System.out.println("4. Yacht");
    }
    
    
}
