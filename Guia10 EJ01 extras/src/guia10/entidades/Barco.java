
package guia10.entidades;

import java.util.Scanner;


// @author Valentin Mathey
 
public class Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos
    protected String tipo, matricula;
    protected int eslora, anioFabricacion;
    protected Alquiler alquiler;
    

    //constructores
    public Barco() {
    }

    public Barco(String tipo, String matricula, int eslora, int anioFabricacion, Alquiler alquiler) {
        this.tipo = tipo;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.alquiler = alquiler;
    }

    //metodos
    protected void crearBarco(Barco b1, Alquiler a1){
        System.out.println("Ingrese la matricula");
        matricula = leer.next();
        System.out.println("Ingrese la eslora en Metros");
        eslora = leer.nextInt();
        alquiler = a1.crearAlquiler(b1, a1);
        b1.getAlquiler().setPrecioAlquiler(calcularPrecio(b1));
    }
    
    public int calcularPrecio(Barco b1){
        int  diasAlquiler, precioFinal;
        diasAlquiler = b1.getAlquiler().getFechaAquiler().getDay() - b1.getAlquiler().getFechaDevolucion().getDay();
        precioFinal = diasAlquiler * (eslora * 10);
        return precioFinal;
    }
     
    //getter and setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
    
    
}
