/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author User
 */
public class EJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new  Scanner(System.in);
        Date fecha1 = new Date(); 
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        
        System.out.println("escriba el dia");
        fecha1.setDate(leer.nextInt());
        System.out.println("escriba el mes");
        fecha1.setMonth(leer.nextInt()-1);
        System.out.println("escriba el anio");
        fecha1.setYear(Math.abs(leer.nextInt()-1900));
        
        System.out.println(sdf.format(fecha1));
        System.out.println(sdf.format(fechaActual));
        System.out.println("La diferencia de años que hay es " + Math.abs(fechaActual.getYear()-fecha1.getYear()));
    }
    
}
