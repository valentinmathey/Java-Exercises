/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.Servicios;

import guia7.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Operaciones {
    Scanner leer = new Scanner(System.in);
    Rectangulo rec2 = new Rectangulo();
    
    public Rectangulo CrearRectangulo() {
        System.out.println("escriba la altura del rectangulo");
        rec2.setAltura(leer.nextDouble());
        System.out.println("escriba la base del rectangulo");
        rec2.setBase(leer.nextDouble());
        return rec2;
    }
    
    public void CalcularPerimetro(Rectangulo rec2){
        rec2.setPerimetro((rec2.getAltura()+rec2.getBase())*2);
    }
    
    public void CalcularSuperficie(Rectangulo rec2){
        rec2.setSuperficie(rec2.getAltura()*rec2.getBase());
    }
    
    public void DibujarRectangulo(Rectangulo rec2){
        System.out.println(" ");
        for (int i = 0; i < rec2.getAltura(); i++){
            for (int j = 0; j < rec2.getBase(); j++){
                if ((i == 0) || (i == rec2.getBase())){
                    System.out.print("* ");
                } else if ((j == 0) || (j == rec2.getBase()-1) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
            
}
