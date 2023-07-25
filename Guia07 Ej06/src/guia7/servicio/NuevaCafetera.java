/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.servicio;

import guia7.entindades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class NuevaCafetera {
    Scanner leer = new Scanner(System.in);
    Cafetera c2 = new Cafetera();
    
    public Cafetera crearCafetera(){
        System.out.println("capacidad maxima de la cafetera?");
        c2.setCapacidadMaxima(leer.nextDouble());
        c2.setCantidadActual(c2.getCapacidadMaxima());
        System.out.println("cafetera nueva");
        return c2;
    }
    public void llenarCafetera(Cafetera c2){
        c2.setCantidadActual(c2.getCapacidadMaxima());
        System.out.println("cafetera llena");
    }
    
    public void servirTaza(Cafetera c2){
        System.out.println("tamaño de la taza");
        int taza = leer.nextInt();
        if (c2.getCantidadActual()==0){
            System.out.println("cafetera vacia debe llenarla nuevamente");
        } else if(taza > c2.getCantidadActual()) {
            System.out.println("taza incompleta, se lleno hasta un " + ((c2.getCantidadActual()*100)/taza) + "%");
            c2.setCantidadActual(0.0);
        } else {
            System.out.println("taza llena");
            c2.setCantidadActual(c2.getCantidadActual()-taza);
        }
    }
    
    public void vaciarCafetera(Cafetera c2){
        c2.setCantidadActual(0.0);
        System.out.println("cafetera vacia");
    }
    
    public void agregarCafe(Cafetera c2){
        System.out.println("cantidad que cafe que desea agregar?");
        Double agregar = leer.nextDouble();
        while((agregar + c2.getCantidadActual()) > c2.getCapacidadMaxima()){
            System.out.println("la cantidad de cafe pasa la medida maxima de la cafetera, ingrese nuevamente la medida a agregar");
            agregar = leer.nextDouble();
        }
        c2.setCantidadActual(c2.getCantidadActual() + agregar);
        System.out.println("cafe agregado");
    }

}
