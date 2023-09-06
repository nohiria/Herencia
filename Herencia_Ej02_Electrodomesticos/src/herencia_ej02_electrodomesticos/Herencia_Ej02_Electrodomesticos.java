
//<editor-fold desc="Exercise 2 statement">
/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

LETRA PRECIO                          PESO PRECIO
A $1000                               Entre 1 y 19 kg $100
B $800                                Entre 20 y 49 kg $500
C $600                                Entre 50 y 79 kg $800
D $500                                Mayor que 80 kg $1000
E $300
F $100

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
//</editor-fold>

//<editor-fold desc="Exercise 3 statement">
//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
//</editor-fold>

package herencia_ej02_electrodomesticos;

import Entities.Appliance;
import Entities.Television;
import Entities.WashingMachine;
import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class Herencia_Ej02_Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        WashingMachine ws= new WashingMachine();
//        Television tv= new Television();
//        
//        ws.createWashingMachine();
//        tv.createTelevision();
//        
//        System.out.println("The washing machine final price: "+ ws.getPrice());
//        System.out.println("The televison final price: "+ tv.getPrice());
        
        //Ejercicio 3
        ArrayList<Appliance> appliancesList= new ArrayList<>();
        
        WashingMachine ws1= new WashingMachine(32, "black", 'F', 81);
        WashingMachine ws2= new WashingMachine(20, "white", 'A', 50);
        Television tv1= new Television(42, true, "gray", 'F', 81);
        Television tv2= new Television(30, false, "blue", 'C', 53);
        
        appliancesList.add(ws1);
        appliancesList.add(ws2);
        appliancesList.add(tv1);
        appliancesList.add(tv2);
        
        int applianceNumber= 0;
        double washingMachinesTotalAmount= 0;
        double tvsTotalAmount= 0;
        
        for(Appliance appliance: appliancesList){
            applianceNumber++;
            System.out.println("Appliance n°"+applianceNumber);
            if(appliance instanceof WashingMachine){
                System.out.println("Washing machine price: "+ appliance.getPrice());
                washingMachinesTotalAmount+= appliance.getPrice();
            }else if(appliance instanceof Television){
                System.out.println("Television price: "+ appliance.getPrice());
                tvsTotalAmount+= appliance.getPrice();
            }
        }
        
        System.out.println("Total amount for all appliances: "+ (washingMachinesTotalAmount+tvsTotalAmount));
        System.out.println("Total amount for all washing machines: "+ washingMachinesTotalAmount);
        System.out.println("Total amount for all TV: "+tvsTotalAmount);
    }
    
}
