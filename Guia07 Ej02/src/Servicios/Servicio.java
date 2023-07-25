/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia CrearCircunferencia(){
        System.out.println("escriba el radio");
        Double radio = leer.nextDouble();
        Circunferencia c2 = new Circunferencia();
        c2.setRadio(radio);
        return c2;
    }
    
    public void CalcularArea(Circunferencia c2){
      Double area = Math.PI * Math.pow(c2.getRadio(), 2);
      c2.setArea(area);
    }
    
    public void CalcularPerimetro(Circunferencia c2){
      Double perimetro = Math.PI * c2.getRadio() * 2;
      c2.setPerimetro(perimetro);
    }
}
