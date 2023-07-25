
package guia10;

import guia10.entidades.Alquiler;
import guia10.entidades.Barco;
import guia10.entidades.BarcoMotor;
import guia10.entidades.Velero;
import guia10.entidades.Yate;
import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ1Extras {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Barco> barcos = new ArrayList<>();
        ArrayList<Alquiler> alquileres = new ArrayList<>();
        
        Boolean vf = true;
        int opc;
        
        System.out.println("Bienvenidos al puerto");
        do {            
            System.out.println("\nElija un tipo de barco a crear");
            System.out.println("1 - Crear Yate");
            System.out.println("2 - Crea Barco a motor");
            System.out.println("3 - Crear Velero");
            System.out.println("4 - Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1 -> {
                    String salir;
                    do {
                        Yate b1 =  new Yate();
                        Alquiler a1 = new Alquiler();
                        b1.crearYate(b1, a1);
                        barcos.add(b1);
                        alquileres.add(a1);
                        System.out.println("\nDesea crear otro Yate SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI"));
 
                }
                case 2 -> {
                    String salir;
                    do {
                        BarcoMotor b1 = new BarcoMotor();
                        Alquiler a1 = new Alquiler();
                        b1.crearBarcoMotor(b1, a1);
                        barcos.add(b1);
                        alquileres.add(a1);
                        System.out.println("\nDesea crear otro Barco a motor SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI"));
                    
                }
                case 3 -> {
                    String salir;
                    do {
                        Velero b1 = new Velero();
                        Alquiler a1 = new Alquiler();
                        b1.crearVelero(b1, a1);
                        barcos.add(b1);
                        alquileres.add(a1);
                        System.out.println("\nDesea crear otro Velero SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI"));
                    
                } 
                case 4 -> vf = false;
                default -> System.out.println("Opcion incorrecta\n");
            }
            
        } while (vf);
    }
}
