
package guia9.entidades;


// @author Valentin Mathey
 
public class Carta {
    //atributos
    private int numero;
    private String palo;
    
    //constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    //getter and setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    //metodos
    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    
}
