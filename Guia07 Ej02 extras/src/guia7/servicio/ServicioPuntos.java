
package guia7.servicio;

import guia7.entindad.Puntos;
import java.util.Scanner;


// @author Valentin Mathey
 
public class ServicioPuntos {
    Scanner leer = new Scanner(System.in);
    
    public void crearPuntos(Puntos p1){
        System.out.println("escriba la coordenada x del primer punto");
        p1.setX1(leer.nextDouble());
        System.out.println("escriba la coordenada y del primer punto");
        p1.setY1(leer.nextDouble());
        System.out.println("escriba la coordenada x del segundo punto");
        p1.setX2(leer.nextDouble());
        System.out.println("escriba la coordenada y del segundo punto");
        p1.setY2(leer.nextDouble());
    }
    
    public void calcularDistancia(Puntos p1){
        Double aux = calcularTrinomio(p1.getX1(),p1.getY1()) + calcularTrinomio(p1.getX2(),p1.getY2());
        Double distancia = Math.sqrt(aux);
        System.out.println("la distancia entre los dos puntos es de " + distancia);
    }

    private Double calcularTrinomio(Double x, Double y){
        Double rta = (Math.pow(x, 2) - 2*x*y + Math.pow(y, 2));
        return rta;
    }
    
}
