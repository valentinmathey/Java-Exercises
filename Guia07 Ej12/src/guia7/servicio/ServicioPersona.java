
package guia7.servicio;

import guia7.entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Valentin Mathey
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    Date fechaAux = new Date();
    Date fechaActual = new Date();
    
    public void CrearPersona(Persona p1){
        System.out.println("escriba el nombre de la persona");
        p1.setNombre(leer.nextLine());
        System.out.println("escriba el dia de nacimineto");
        fechaAux.setDate(leer.nextInt());
        System.out.println("escriba el mes de nacimiento");
        fechaAux.setMonth(leer.nextInt()-1);
        System.out.println("escriba el anio de nacimiento");
        fechaAux.setYear(leer.nextInt()-1900);
        p1.setNacimineto(fechaAux);
    } 
    
    public void calcularEdad(Persona p1){
        p1.setEdad(fechaActual.getYear() - fechaAux.getYear());
        if (fechaActual.getMonth()<=fechaAux.getMonth()) {
            if (fechaActual.getMonth()==fechaAux.getMonth()) {
                if (fechaActual.getDay()<fechaAux.getDay()) {
                    p1.setEdad(p1.getEdad() - 1);
                }
            } else {
                p1.setEdad(p1.getEdad() - 1);
            }
            
        }
        System.out.println("la persona tiene " + p1.getEdad() + " anios");
    }
    
    public void esMayor(Persona p1){
        Boolean vf;
        System.out.println("escriba una edad a comparar");
        int edad2 = leer.nextInt();
        vf = p1.getEdad() < edad2;
        if (vf) {
            System.out.println("la edad ingresada es mas grande que la persona");
        } else {
            System.out.println("la edad ingresada es mas chica que la persona");
        }
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.toString());
    }
}
