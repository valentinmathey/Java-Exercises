
package guia10;

import guia10.entidades.Electrodomesticos;
import guia10.entidades.Lavadora;
import guia10.entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ2y3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Boolean vf = true;
        int precioLavadoras = 0, precioTelevisores = 0, precioElectrodomesticos = 0, opc;
        ArrayList<Electrodomesticos> totalElectrodomesticos = new ArrayList<>();
        
        System.out.println("Bienvenidos al creador de electrodomesticos");
        do {            
            System.out.println("\nElija una opcion");
            System.out.println("1 - Crear Lavadora");
            System.out.println("2 - Crea Televisor");
            System.out.println("3 - Ver precios");
            System.out.println("4 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1 -> {
                    String salir;
                    do {
                        Lavadora l = new Lavadora();
                        l.crearLavadora();
                        totalElectrodomesticos.add(l);
                        System.out.println("\nDesea crear otra Lavadora SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI"));

                    
                }
                case 2 -> {
                    String salir;
                    do {
                        Televisor t = new Televisor();
                        t.crearTelevision();
                        totalElectrodomesticos.add(t);
                        System.out.println("\nDesea crear otro Televisor SI/NO");
                        salir = leer.next();
                    } while (salir.equalsIgnoreCase("SI"));
                    
                }
                case 3 -> {
                        for (Electrodomesticos aux : totalElectrodomesticos) {
                            precioElectrodomesticos += aux.getPrecio();
                            if (aux.getTipo().equalsIgnoreCase("Televisor")) {
                                precioTelevisores += aux.getPrecio();
                            } else {
                                precioLavadoras += aux.getPrecio();
                            }
                        }
                    System.out.println("El precio de todas las Lavadoras es de: " + precioLavadoras + "$");
                    System.out.println("El precio de todas los Televisores es de: " + precioTelevisores + "$");
                    System.out.println("El precio de todas los Electrodomesticos es de: " + precioElectrodomesticos + "$");
                    
                    
                }
                case 4 -> vf = false;
                default -> System.out.println("Opcion incorrecta\n");
            }
            
        } while (vf);
    }

}
