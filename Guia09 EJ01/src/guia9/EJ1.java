
package guia9;

import guia9.entidades.Persona;
import guia9.servicios.Metodos;


// @author Valentin Mathey

public class EJ1 {

    public static void main(String[] args) {
        Persona[] personas = new Persona[2];
        Metodos mt = new Metodos();
        
        for (int i = 0; i < 2; i++) {
            personas[i] = mt.crearPersona(i);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(personas[i].toString(i));
        }
    }

}
