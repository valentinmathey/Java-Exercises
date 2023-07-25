
package guia10;

import guia10.entidades.Edificio;
import guia10.entidades.EdificioDeOficinas;
import guia10.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ2Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> Edificios = new ArrayList<>();
        int opc;
        Boolean vf = true;
        
        System.out.println("Bienvenidos al creador de edificios");
        do {            
            System.out.println("\nElija un tipo de edificio a crear");
            System.out.println("1 - Crear Polideportivo");
            System.out.println("2 - Crea Edificio de oficinas");
            System.out.println("3 - Mostrar datos");
            System.out.println("4 - Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1 -> {
                    String salir;
                    do {
                        Polideportivo e1 =  new Polideportivo();
                        e1.crearPolideportivo();
                        System.out.println("\nDesea crear otro Polideportivo SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI"));
                }
                case 2 -> {
                    String salir;
                    do {
                        EdificioDeOficinas e1 = new EdificioDeOficinas();
                        e1.crearEdificio();
                        System.out.println("\nDesea crear otro Edificio de oficinas SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI")); 
                }
                case 3 -> {
                    for (Edificio aux : Edificios) {
                        System.out.println("\n");
                        aux.verDatos(Edificios);
                    }
                    
                } 
                case 4 -> vf = false;
                default -> System.out.println("Opcion incorrecta\n");
            }
            
        } while (vf);
    }

}
