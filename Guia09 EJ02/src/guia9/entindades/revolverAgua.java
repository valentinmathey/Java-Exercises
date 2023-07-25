
package guia9.entindades;

import java.util.Random;
import java.util.Scanner;


// @author Valentin Mathey

public class revolverAgua {
    //servicios
    Scanner leer = new Scanner(System.in);
    
    //utilidad
    private int posicionActual;
    private int posicionAgua;
    private int cantBalas;
    private final Random bala = new Random();
    
    //constructor
    public revolverAgua(){
    }
    
    //metodos
    public void llenarRevolver() {
        System.out.println("Ingrese la cantidad de espacios que hay en el cartucho");
        cantBalas = leer.nextInt();
        posicionActual = (bala.nextInt(cantBalas)+1);
        posicionAgua = (bala.nextInt(cantBalas)+1);
        System.out.println("Revolver llenado \n");
        System.out.println(toString());
    }
    
    public Boolean mojar(){
        Boolean agua;
        agua = (posicionActual == posicionAgua);
        return agua;
    }
    
    public void siguienteChorro(){
        posicionActual++;
        if (posicionActual > cantBalas) {
            posicionActual = 1;
        } 
    }

    @Override
    public String toString() {
        return "revolverAgua{" + "La posicion actual es: " + posicionActual + " y la posicion del agua esta en: " + posicionAgua + "}";
    }

    //getter a setter
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }
    
    
}
