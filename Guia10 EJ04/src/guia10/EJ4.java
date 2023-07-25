
package guia10;

import guia10.entidades.Circulo;
import guia10.entidades.Rectangulo;


// @author Valentin Mathey

public class EJ4 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.creaRectangulo();
        
        Rectangulo r1 = new Rectangulo();
        r1.creaRectangulo();
        
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        
        
    }

}
