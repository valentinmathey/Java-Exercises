/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.servicio;

import guia7.entindad.Raices;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ServicioRaices {
    Scanner leer = new Scanner(System.in);
    
    public void iniciarValores(Raices r1){
        System.out.println("escriba el valor de a");
        r1.setA(leer.nextDouble());
        System.out.println("escriba el valor de b");
        r1.setB(leer.nextDouble());
        System.out.println("escriba el valor de c");
        r1.setC(leer.nextDouble());
    }
    
    private Double obtenerDiscriminante(Raices r1){
       Double discriminante = (Math.pow(r1.getB(), 2)-4*r1.getA()*r1.getC());
       return discriminante;
    }
    
    private Boolean tieneRaices(Raices r1){
        Boolean vf = obtenerDiscriminante(r1) > 0;
        if (vf) {
            System.out.println("tiene 2 raices");
        }
        return vf;
    }
    
    private Boolean tieneRaiz(Raices r1){
        Boolean vf = obtenerDiscriminante(r1) == 0;
        if (vf) {
            System.out.println("tiene una unica raiz");
        }
        return vf;
    }
    
    private void obtenerRaices(Raices r1){
        Double raiz1 = (-r1.getB() + Math.sqrt((Math.pow(r1.getB(), 2)) - (4*r1.getA()*r1.getC()))) / (2*r1.getA());
        Double raiz2 = (-r1.getB() - Math.sqrt((Math.pow(r1.getB(), 2)) - (4*r1.getA()*r1.getC()))) / (2*r1.getA());
        System.out.println("las raices que tiene son ");
        System.out.println(raiz1);
        System.out.println(raiz2);
        
    } 
    
    private void obtenerRaiz(Raices r1){
        Double raiz1 = (-r1.getB() + Math.sqrt((Math.pow(r1.getB(), 2)) - (4*r1.getA()*r1.getC()))) / (2*r1.getA());
        System.out.println("las raiz que tiene es ");
        System.out.println(raiz1);
        
    } 
    
    public void calcular(Raices r1){
        if (tieneRaices(r1)) {
            obtenerRaices(r1);
        } else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        } else {
            System.out.println("no tiene solucion");
        }
    }
}
