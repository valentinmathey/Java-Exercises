
package guia9.entidades;

import java.util.ArrayList;


// @author Valentin Mathey
 
public class Sala {
    
    private String nombre;
    private String[][] salaCompleta = new String[8][6];
    private ArrayList<Espectador> espectadores;
    private Pelicula peliculaReproducida;
    
    public static final String letras[] = {"A", "B", "C", "D", "E", "F"};

    
    public Sala() {
        this.espectadores = new ArrayList<>();
               
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String[][] getSalaCompleta() {
        return salaCompleta;
    }

    public void setSalaCompleta(String[][] salaCompleta) {
        this.salaCompleta = salaCompleta;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPeliculaReproducida() {
        return peliculaReproducida;
    }

    public void setPeliculaReproducida(Pelicula peliculaReproducida) {
        this.peliculaReproducida = peliculaReproducida;
    }
    
}
