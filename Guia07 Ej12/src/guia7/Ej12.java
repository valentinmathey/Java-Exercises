package guia7;

import guia7.entidad.Persona;
import guia7.servicio.ServicioPersona;

/**
 *
 * @author Valentin Mathey
 */
public class Ej12 {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = new Persona();
        sp.CrearPersona(p1);
        sp.calcularEdad(p1);
        sp.esMayor(p1);
        sp.mostrarPersona(p1);
    }

}
