/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.Entidades.Cuenta;
import guia7.Servicios.Operaciones;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        Operaciones op1 = new Operaciones();
        Cuenta c1 = op1.crearCuenta();
        
        do{
            System.out.println(" ");
            System.out.println("seleciones una operacion a realizar");
            System.out.println("1 - ingresaDinero");
            System.out.println("2 - retirarDinero");
            System.out.println("3 - extraccionRapida");
            System.out.println("4 - consultaSaldo");
            System.out.println("5 - consultaDatos");
            System.out.println("6 - salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    op1.ingresaDinero(c1);
                    break;
                case 2:
                    op1.retirarDinero(c1);
                    break;
                case 3:
                    op1.extraccionRapida(c1);
                    break;
                case 4:
                    op1.consultaSaldo(c1);
                    break;
                case 5:
                    op1.consultaDatos(c1);
                    break;
                case 6:
                    salir = false;
                    break;
            }
        } while (salir);
    }
    
}
