/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.entindades.Cafetera;
import guia7.servicio.NuevaCafetera;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        NuevaCafetera c1 = new NuevaCafetera();
        Cafetera valentin = c1.crearCafetera();
        
        do{
            System.out.println(" ");
            System.out.println("seleciones una operacion a realizar");
            System.out.println("1 - llenarCafetera");
            System.out.println("2 - servirTaza");
            System.out.println("3 - vaciarCafetera");
            System.out.println("4 - agregarCafe");
            System.out.println("5 - salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    c1.llenarCafetera(valentin);
                    break;
                case 2:
                    c1.servirTaza(valentin);
                    break;
                case 3:
                    c1.vaciarCafetera(valentin);
                    break;
                case 4:
                    c1.agregarCafe(valentin);
                    break;
                case 5:
                    salir = false;
                    break;
            }
        } while (salir);
        
    }
    
}
