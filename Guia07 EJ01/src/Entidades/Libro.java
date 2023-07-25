/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Marco
 */
public class Libro {
    
    /**
    *
    * Atributos Libro
    */
    private String titulo,autor;
    private int isbn,Npagina;
    
    //constructores

    
    public Libro(String titulo, String autor, int isbn, int Npagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.Npagina = Npagina;
    }

    public Libro() {
    }

    //getter & setter
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNpagina() {
        return Npagina;
    }

    public void setNpagina(int Npagina) {
        this.Npagina = Npagina;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", Npagina=" + Npagina + '}';
    }    
    
}
