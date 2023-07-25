/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.entidades.Matematica;
import guia7.servicios.Operaciones;

/**
 *
 * @author VALENTIN
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones();
        Matematica m1 = new Matematica();
        op1.craerObjeto(m1);
        op1.devolverMayor(m1);
        op1.calcularPotencia(m1);
        op1.calcularRaiz(m1);
    }
    
}
