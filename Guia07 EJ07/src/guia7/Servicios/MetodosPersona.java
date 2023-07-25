/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.Servicios;

import guia7.Entidades.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class MetodosPersona {
    
    String sexo;
    public void crearPersona(Persona pp[]){
        
        
        
        for (int i = 0;i<4;i++){
          
           System.out.println("Ingrese los datos de  la persona "+(i+1)+": ");
           
           String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
           
           int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
           
           int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso: "));
           
           int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: "));
           
           do {
               
            sexo = JOptionPane.showInputDialog("Ingrese el sexo: ");
            
           }while(!"H".equals(sexo)&&!"M".equals(sexo)&&!"O".equals(sexo));
           
           
           pp[i] = new Persona(nombre,edad,peso,altura,sexo);
           
       }
        
        
    }
   
    public void calcularMC(Persona pp[]){
        
        for (int i = 0; i < pp.length; i++) {
          
            if (pp[i].getPeso()/(pp[i].getAltura()*pp[i].getAltura())>25) {
                
                pp[i].setMc(1);
                
            }else if(pp[i].getPeso()/(pp[i].getAltura()*pp[i].getAltura())>20 && pp[i].getPeso()/(pp[i].getAltura()*pp[i].getAltura())<=25){
                
                 pp[i].setMc(0);
                
            }else{
                
                pp[i].setMc(-1);
               
            }  
            
        }     
    }
    
    public void esMayorDeEdad(Persona pp[]){
        
        for (int i = 0; i < pp.length; i++) {
           
            if(pp[i].getEdad()>=18){
                
                pp[i].setMe(true);
                
            }  
        } 
    }
    
}
