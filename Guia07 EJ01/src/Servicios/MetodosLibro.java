
package Servicios;

import Entidades.Libro;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodosLibro {
    
    
    Scanner entrada = new Scanner(System.in);
    
    
    public void cargarLibro(Libro book[]){
       
       
       
       
       for (int i = 0;i<book.length;i++){
          
           System.out.println("Ingrese los datos del libro "+(i+1)+": ");
           
           String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro: ");
           
           String autor = JOptionPane.showInputDialog("Ingrese el autor del libro: ");
           
           int isbn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ISBN: "));
           
           int Npagina = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de paginas del libro: "));
           
           book[i] = new Libro(titulo,autor,isbn,Npagina);
           
       }
    }
    
    public void mostrarDatos(Libro book[]){
        
        
        
        for(int i=0;i<book.length;i++){
            
         System.out.println(book[i].toString());
            
            
            
        }
    }
    
    
    
}

