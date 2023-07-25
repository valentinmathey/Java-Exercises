
package guia9.entidades;


// @author Valentin Mathey
 
public class Perro {
    //atributos
    private String nombre, raza;
    private int edad;
    private String tamanio;
    
    //utilidad
    public static final String[] tamanios = {"Grande", "Mediano", "Chiquito"};
    
    //constructor
    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    
    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamaño: " + tamanio;
    }
}
