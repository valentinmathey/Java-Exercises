/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.Entindades.Arreglo;
import guia7.Servicios.nuevoArreglo;

/**
 *
 * @author VALENTIN
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nuevoArreglo nr = new nuevoArreglo();
        Arreglo arr1 = new Arreglo();
        nr.llenarPrimerArreglo(arr1);
        nr.ordearPrimerArreglo(arr1);
        nr.llenarSegundoArreglo(arr1);
        nr.mostrarArreglo(arr1);
    }
    

}
