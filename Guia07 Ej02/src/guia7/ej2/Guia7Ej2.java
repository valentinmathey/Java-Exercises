/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7.ej2;


import Circunferencia.Circunferencia;
import Servicios.Servicio;

/**
 *
 * @author VALENTIN
 */
public class Guia7Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio s1 = new Servicio();
        
        Circunferencia c1 = s1.CrearCircunferencia();
        s1.CalcularArea(c1);
        s1.CalcularPerimetro(c1);
                
        System.out.println(c1);
    }
    
}
