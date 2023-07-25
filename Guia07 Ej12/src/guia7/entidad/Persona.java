
package guia7.entidad;

import java.util.Date;

/**
 *
 * @author Valentin Mathey
 */
public class Persona {

    private String nombre;
    private Date nacimineto;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
    }

    public Persona(String nombre, Date nacimineto) {
        this.nombre = nombre;
        this.nacimineto = nacimineto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimineto() {
        return nacimineto;
    }

    public void setNacimineto(Date nacimineto) {
        this.nacimineto = nacimineto;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimineto=" + nacimineto + ", edad=" + edad + '}';
    }
    
    
}
