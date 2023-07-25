/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import guia7.Entidades.Persona;
import guia7.Servicios.MetodosPersona;

/**
 *
 * @author Marco
 */
public class EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contMayor = 0, contMenor = 0;
        int contAlto = 0,contPromedio = 0, contBajo = 0;
        
        Persona pp[] = new Persona[4];
        
        MetodosPersona carga = new MetodosPersona();
        
        
        carga.crearPersona(pp);
        carga.calcularMC(pp);
        carga.esMayorDeEdad(pp);
        
        for (int i = 0; i <pp.length; i++) {
            
           if (pp[i].isMe() == true) {
               contMayor = contMayor + 1; 
            } else {
               contMenor = contMenor + 1; 
            }
            switch (pp[i].getMc()) {
                case 1:
                    contAlto += 1;
                    break;
                case 0:
                    contPromedio += 1; 
                    break;
                default:
                    contBajo += 1;
                    break;
            }
        }
        
        System.out.println("El porcentaje de personas mayores de edad son: " + (contMayor * 100) / 4 + "%");
        System.out.println("El porcentaje de personas menores de edad son: " + (contMenor * 100) / 4 + "%");
        System.out.println("El porcentaje de personas con IMC = 1 son: " + (contAlto * 100) / 4 + "%");
        System.out.println("El porcentaje de personas con IMC = 0 son: " + (contPromedio * 100) / 4 + "%");
        System.out.println("El porcentaje de personas con IMC = -1 son: " + (contBajo * 100) / 4 + "%"); 
            
            
        
        
    }
    
}
