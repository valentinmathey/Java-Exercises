
package guia7;

import guia7.entindad.Puntos;
import guia7.servicio.ServicioPuntos;


// @author Valentin Mathey

public class Ej2Extras {

    public static void main(String[] args) {

        ServicioPuntos sp = new ServicioPuntos();
        Puntos p1 = new Puntos();
        sp.crearPuntos(p1);
        sp.calcularDistancia(p1);
    }

}
