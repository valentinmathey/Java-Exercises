
package guia10.entidades;

import java.util.Scanner;


// @author Valentin Mathey
 
public class Circulo implements calculosFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Double perimetro, area, radio;

    public Circulo() {
    }

    public Circulo(Double perimetro, Double area, Double radio) {
        this.perimetro = perimetro;
        this.area = area;
        this.radio = radio;
    }
            
    public void creaRectangulo(){
        System.out.println("\nCreador de un circulo");
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
        calcularArea();
        calcularPerimetro();
    }
    
    @Override
    public Double calcularArea(){
        area = CONSTANTE * Math.pow(radio, 2);
        return area;
    }
    
    @Override
    public Double calcularPerimetro(){
        perimetro = CONSTANTE * radio * 2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "perimetro=" + perimetro + ", area=" + area + ", radio=" + radio + '}';
    }
    
}
