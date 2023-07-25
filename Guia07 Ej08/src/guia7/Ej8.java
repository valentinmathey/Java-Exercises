/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia7;

import guia7.entidades.Cadena;
import guia7.servicios.metodoCadena;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Cadena frase1 = new Cadena();
       metodoCadena mt = new metodoCadena();
       
       System.out.println("escribe una frase");
       frase1.setFrase(leer.nextLine());
       
       mt.mostrarVocales(frase1);
       mt.invertirFrase(frase1);
       mt.vecesRepetir(frase1);
       mt.compararLongitud(frase1);
       mt.unirFrases(frase1);
       mt.reemplazar(frase1);
       mt.contiene(frase1);
       
    }
}
