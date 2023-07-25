/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia7.servicios;

import guia7.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author VALENTIN
 */
public class metodoCadena {
    Scanner leer = new Scanner(System.in);
    int cont1 = 0, cont2 = 0;
    
    
    public void mostrarVocales(Cadena frase1){
        for (int i = 0; i < frase1.getFrase().length(); i++) {
            if (frase1.getFrase().substring(i, i+1).equalsIgnoreCase("a") || frase1.getFrase().substring(i, i+1).equalsIgnoreCase("e") || frase1.getFrase().substring(i, i+1).equalsIgnoreCase("i") || frase1.getFrase().substring(i, i+1).equalsIgnoreCase("o") || frase1.getFrase().substring(i, i+1).equalsIgnoreCase("u")){
                cont1++;
            }
        }
        System.out.println("la frase ingresada tiene " + cont1 + " vocales");     
    }
    
    public void invertirFrase(Cadena frase1){
        StringBuilder sb = new StringBuilder(frase1.getFrase());  
        System.out.println(sb.reverse());
    }
    
    public void vecesRepetir(Cadena frase1) {
        System.out.println("escriba una letra a encontrar");
        String letra = leer.nextLine();
        for (int i = 0; i < frase1.getFrase().length(); i++) {
            if (frase1.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                cont2++;
            }
        }
        if (cont2 == 0) {
            System.out.println("la vocal ingresada no se encuentra dentro de la farse");
        } else {
           System.out.println("la vocal ingresada se encuentra " + cont2 + " veces dentro de la frase"); 
        }
    }
    
    public void compararLongitud(Cadena frase1){
        System.out.println("escriba una frase para comparar la longitud");
        String fraseN1 = leer.nextLine();
        if (frase1.getFrase().length() == fraseN1.length()){
            System.out.println("las frases tienen el mismo tamaño");
        } else {
            System.out.println("las frases tienen diferentes tamaños");
        }
    }
    
    public void unirFrases(Cadena frase1){
        System.out.println("escriba una frase para unir");
        String fraseN2 = leer.nextLine();
        fraseN2 = frase1.getFrase().concat(" " + fraseN2);
        System.out.println(fraseN2);
    }
    
    public void reemplazar(Cadena frase1){
        System.out.println("escriba un caracter para reemplazar por la vocal a");
        String caracter1 = leer.nextLine();
        String fraseN3 = frase1.getFrase();
        for (int i = 0; i < frase1.getFrase().length(); i++) {
            if (fraseN3.substring(i, i+1).equalsIgnoreCase("a")) {
                fraseN3 = frase1.getFrase().replace("a", caracter1);
            }
        }
        System.out.println(fraseN3);
    }
    
    public void contiene(Cadena frase1){
        System.out.println("escriba un caracter a bucar");
        String caracter2 = leer.nextLine();
        Boolean letra = false;
        for (int i = 0; i < frase1.getFrase().length(); i++) {
            if (frase1.getFrase().substring(i, i+1).equalsIgnoreCase(caracter2)){
                letra = true;
            }
        }
        if (letra) {
            System.out.println("el caracter ingresado se encuentra dentro de la frase");
        } else {
            System.out.println("el caracter ingresado no se encuentra dentro de la frase");
        }
    }
}
