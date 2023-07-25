/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.Entidades.Rectangulo;
import guia7.Servicios.Operaciones;

/**
 *
 * @author VALENTIN
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones();
        Rectangulo rec1 = op1.CrearRectangulo();
        op1.CalcularPerimetro(rec1);
        op1.CalcularSuperficie(rec1);
        System.out.println(rec1);
        op1.DibujarRectangulo(rec1);
    }
    
}
