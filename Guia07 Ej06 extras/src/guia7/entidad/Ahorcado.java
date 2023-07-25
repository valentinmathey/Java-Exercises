
package guia7.entidad;


// @author Valentin Mathey
 
public class Ahorcado {

    private String palabra[];
    private String palabraAux[];
    private int encontradas = 0, jugadas;

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    
}
