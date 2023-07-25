
package guia7;

import guia7.entidad.NIF;
import guia7.servicio.ServicioNIF;


// @author Valentin Mathey

public class Ej4Extras {

    public static void main(String[] args) {

        ServicioNIF snif = new ServicioNIF();
        NIF nif1 = new NIF();
        snif.crearNIF(nif1);
        snif.mostrar(nif1);
        
    }

}
