
package Cancion.Servicios;

import Cancion.Atributos.Atributos;
import java.util.Scanner;


public class NewSong {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Atributos CrearCancion(){
        
        System.out.println("ingrese en titulo de la cancion");
        String titulo = leer.nextLine();
        
        System.out.println("ingrese en autor de la cancion");
        String autor = leer.nextLine();
        
        return new Atributos(titulo, autor);
    }
            
}
