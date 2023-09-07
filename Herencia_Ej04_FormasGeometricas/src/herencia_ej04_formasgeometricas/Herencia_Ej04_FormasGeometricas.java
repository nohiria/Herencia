/*
 *Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package herencia_ej04_formasgeometricas;

import Entities.Circle;
import Entities.Rectangle;

/**
 *
 * @author nohyv
 */
public class Herencia_Ej04_FormasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle= new Circle(5);
        Rectangle rectangle= new Rectangle(4, 5);
        
        System.out.println("Circle area: "+ circle.calculateArea());
        System.out.println("Circle perimeter: "+ circle.calculatePerimeter());
        
        System.out.println("Rectangle area: "+ rectangle.calculateArea());
        System.out.println("Recangle perimeter: "+ rectangle.calculatePerimeter());
    }
    
}
