/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.Servicios;

import guia7.Entindades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author VALENTIN
 */
public class nuevoArreglo {
    
    public void llenarPrimerArreglo(Arreglo arr1){
        for (int i = 0; i < arr1.getArreglo1().length ; i++) {
            arr1.getArreglo1()[i]=(Math.random()*100);
        } 
    }
    
    public void mostrarArreglo(Arreglo arr1){
        for (int i = 0; i < arr1.getArreglo1().length; i++) {
            System.out.println(arr1.getArreglo1()[i]);
        }
        System.out.println("------------------------------");
        for (int i = 0; i < arr1.getArreglo2().length; i++) {
            System.out.println(arr1.getArreglo2()[i]);
        }
    }
    
    public void ordearPrimerArreglo(Arreglo arr1){
        Arrays.sort(arr1.getArreglo1());
    }
    
    public void llenarSegundoArreglo(Arreglo arr1){
        for (int i = 0; i < 10; i++) {
            arr1.getArreglo2()[i] = arr1.getArreglo1()[i];
        }
        for (int i = 10; i < 20; i++) {
            arr1.getArreglo2()[i] = 0.5;
        }
    }
    
}
