/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.Entidades.Numero;
import guia7.Servicios.Operaciones;

/**
 *
 * @author VALENTIN
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones();
        Numero n1 = op1.crearOperacion();
        op1.sumar(n1);
        op1.restar(n1);
        op1.multiplicar(n1);
        op1.dividir(n1);
        System.out.println(n1);
    }
    
}
