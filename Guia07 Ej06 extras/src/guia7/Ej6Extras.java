
package guia7;

import guia7.entidad.Ahorcado;
import guia7.servicio.iniciarJuego;


// @author Valentin Mathey

public class Ej6Extras {

    public static void main(String[] args) {

        iniciarJuego IJ = new iniciarJuego();
        Ahorcado palabra1 = new Ahorcado();
        IJ.juego(palabra1);
    }

}
