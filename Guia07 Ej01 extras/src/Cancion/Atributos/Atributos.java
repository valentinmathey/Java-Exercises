
package Cancion.Atributos;


public class Atributos {
    
    private String titulo;
    private String autor;
    
    public Atributos() {
    }

    public Atributos(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Atributos{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

    
    
    
    
}
