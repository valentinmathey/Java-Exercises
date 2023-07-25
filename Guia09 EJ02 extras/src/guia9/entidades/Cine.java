
package guia9.entidades;

import java.util.ArrayList;


// @author Valentin Mathey
 
public class Cine {

    private ArrayList<Sala> salas;
    private ArrayList<Pelicula> peliculas;
    private int precio;

    public Cine() {
        this.peliculas = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
