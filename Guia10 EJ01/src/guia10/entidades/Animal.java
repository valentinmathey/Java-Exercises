
package guia10.entidades;


// @author Valentin Mathey
 
public class Animal {

    protected String nombre, alimento, raza;
    protected int edad;

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
 
    public void Alimentarse(){
        System.out.println("Se alimneta de " + this.alimento);
    }
}
