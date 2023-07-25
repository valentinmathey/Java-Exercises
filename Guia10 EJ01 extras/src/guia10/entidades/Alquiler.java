
package guia10.entidades;

import java.util.Date;
import java.util.Scanner;


// @author Valentin Mathey
 
public class Alquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos
    protected String nombre, dni;
    protected int posicionAmarre, precioAlquiler;
    protected Barco barco;
    protected Date fechaAquiler, fechaDevolucion;

    //constructores
    public Alquiler() {
    }

    public Alquiler(String nombre, String dni, int posicionAmarre, int precioAlquiler, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.posicionAmarre = posicionAmarre;
        this.precioAlquiler = precioAlquiler;
        this.barco = barco;
    }
    
    //metodos
    public Alquiler crearAlquiler(Barco b1, Alquiler a1){
        System.out.println("\nVamos a asignarle un alquiler");
        System.out.println("Ingrese el nombre");
        a1.setNombre(leer.next()); 
        System.out.println("Ingrese el DNI");
        a1.setDni(leer.next());
        System.out.println("Ingrese la posicion del amarre");
        a1.setPosicionAmarre(leer.nextInt());
        System.out.println("Ingrese la fecha de alquiler");
        fechaAquiler = crearFecha(fechaAquiler);
        System.out.println("Ingrese la fecha de devolucion");
        fechaDevolucion = crearFecha(fechaDevolucion);
        barco = b1;
        return a1;
    }
    
    private Date crearFecha(Date d1){
        System.out.println("Dia: ");
        d1.setDate(leer.nextInt());
        System.out.println("Mes: ");
        d1.setMonth(leer.nextInt()-1);
        System.out.println("Año: ");
        d1.setYear(leer.nextInt()-1900);
        return d1;
    }
    
    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Date getFechaAquiler() {
        return fechaAquiler;
    }

    public void setFechaAquiler(Date fechaAquiler) {
        this.fechaAquiler = fechaAquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
    
    
}
