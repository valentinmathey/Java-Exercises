
package guia7;

import guia7.entindad.Raices;
import guia7.servicio.ServicioRaices;


public class Ej3Extras {


    public static void main(String[] args) {
        ServicioRaices sr = new ServicioRaices();
        Raices r1 = new Raices();
        sr.iniciarValores(r1);
        sr.calcular(r1);
        
    }
    
}
