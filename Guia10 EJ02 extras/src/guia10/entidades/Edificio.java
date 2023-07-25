
package guia10.entidades;

import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey
 
public abstract class Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double ancho, alto, largo, superficie, volumen, tipo;

    public Edificio() {
    }

    public Edificio(Double ancho, Double alto, Double largo, Double superficie, Double volumen, Double tipo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.superficie = superficie;
        this.volumen = volumen;
        this.tipo = tipo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumne();
    
    public abstract void verDatos(ArrayList<Edificio> Edificios);

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Double getTipo() {
        return tipo;
    }

    public void setTipo(Double tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return " ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", superficie=" + superficie + ", volumen=" + volumen + '}';
    }
    

    
}
