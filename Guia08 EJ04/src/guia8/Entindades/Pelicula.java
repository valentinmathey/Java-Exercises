
package guia8.Entindades;

import java.util.Comparator;


// @author Valentin Mathey
 
public class Pelicula {
    //atributos
    private String titulo,director;
    private Double horas;

    //constructores
    
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    //getters & setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }
    
    //metodo para mostrar el objeto
    
    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
    
    //comparadores (ordenado de un array de tipo pelicula)
    
    //expresion simplificada con el uso de lambda
    public static Comparator<Pelicula> ordenarDuracionMayoraMenor = (Pelicula t, Pelicula t1) -> t1.getHoras().compareTo(t.getHoras()); 
    
    //experesion de comparacion de un solo atributo
    public static Comparator<Pelicula> ordenarDuracionMenoraMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getHoras().compareTo(t1.getHoras());
            
        }
    };
    
    //experesion de comparacion de un solo atributo
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareTo(t1.getTitulo());
            
        }
    };
    
    //experesion de comparacion de dos atributos
    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            String a = new String(t.getDirector()+t.getTitulo());
            String b = new String(t1.getDirector()+t1.getTitulo());
        
        return a.compareTo(b);
            
        }
    };
}
