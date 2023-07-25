
package guia10.entidades;

import java.util.Scanner;


// @author Valentin Mathey
 
public class Electrodomesticos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //atributos
    protected String tipo, color, consumo;
    protected int precio, peso;
    
    //utilidad
    protected final String[] consumos = {"A", "B", "C", "D", "E", "F"};
    protected final String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
    
    //constructores
    public Electrodomesticos() {
    }

    public Electrodomesticos(String tipo, String color, String consumo, int precio, int peso) {
        this.tipo = tipo;
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.peso = peso;
    }


    //metodos
    public void crearElectrodomestico (){
        System.out.println("Ingrese el color");
        color = leer.next();
        color = this.comprobarColor(color, colores);
        System.out.println("Ingrese el consumo con una letra");
        consumo = leer.next();
        consumo = this.comprobarConsumo(consumo, consumos);
        System.out.println("Ingrese el peso en kg");
        peso = leer.nextInt();
        precio = this.precioFinal(consumo, peso);

    }

    private String comprobarConsumo(String letra, String[] consumos){
        for (String aux : consumos) {
            if (aux.equalsIgnoreCase(letra)) {
                return aux;
            }
        }
        System.out.println("No esta disponible ese consumo, se le asigna F por defecto");
        return "F";
    }
    
    private String comprobarColor (String color, String[] colores){
        for (String aux : colores) {
            if (aux.equalsIgnoreCase(color)) {
                return aux;
            }
        }
        System.out.println("No esta disponible ese color, se le asigna Blanco por defecto");
        return "Blanco";
    }
    
    protected int precioFinal(String consumo, int peso){
        int precioFinal;
        switch (consumo) {
            case "A" -> precioFinal = 1000;
            case "B" -> precioFinal = 800;
            case "C" -> precioFinal = 600;
            case "D" -> precioFinal = 500;
            case "E" -> precioFinal = 300;
            case "F" -> precioFinal = 100;
            default -> precioFinal = 1000;    
        }
        if (peso <= 19) {
            precioFinal = precioFinal + 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal = precioFinal + 500;
        } else if (peso >= 50 && peso <= 79){
            precioFinal = precioFinal + 800;
        } else {
            precioFinal = precioFinal + 1000;
        }
        return precioFinal;
    }
    
    //getter and setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public String[] getConsumos() {
        return consumos;
    }

    public String[] getColores() {
        return colores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return "color=" + color + ", consumo=" + consumo + ", precio=" + precio + ", peso=" + peso;
    }
}
