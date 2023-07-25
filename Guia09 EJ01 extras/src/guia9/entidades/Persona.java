
package guia9.entidades;


// @author Valentin Mathey
 
public class Persona {
    //atributos
    private String nombre, apellido, dni;
    private int edad;
    private Perro mascota;
    
    //constructor
    public Persona() {
    }
    
    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    public String toString(int i) {
        return "Persona " + (i+1) + "{ " + "nombre: " + nombre + ", apellido: " + apellido + ", dni: " + dni + ", edad: " + edad + " } \n Mascota {" + mascota + " }";
    }
}
