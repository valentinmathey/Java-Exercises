
package Cancion;

import Cancion.Atributos.Atributos;
import Cancion.Servicios.NewSong;


public class Cancion {


    public static void main(String[] args) {
        
        NewSong ns = new NewSong();
        
        Atributos c1 = ns.CrearCancion();
        
        System.out.println(c1.toString());
    }
    
}
