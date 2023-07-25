
package guia10.entidades;

import java.util.Scanner;


// @author Valentin Mathey
 
public class Rectangulo implements calculosFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Double perimetro, area, base, altura;

    public Rectangulo() {
    }
    
    public Rectangulo(Double perimetro, Double area, Double base, Double altura) {
        this.perimetro = perimetro;
        this.area = area;
        this.base = base;
        this.altura = altura;
    }
            
    public void creaRectangulo(){
        System.out.println("\nCreador de un rectangulo");
        System.out.println("Ingrese la base: ");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura");
        altura = leer.nextDouble();
        calcularArea();
        calcularPerimetro();
    }
    
    @Override
    public Double calcularArea(){
        area = base * altura;
        return area;
    }
    
    @Override
    public Double calcularPerimetro(){
        perimetro = (base + altura) * 2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "perimetro=" + perimetro + ", area=" + area + ", base=" + base + ", altura=" + altura + '}';
    }

}
