
package guia10;

import guia10.entidades.Animal;
import guia10.entidades.Caballo;
import guia10.entidades.Gato;
import guia10.entidades.Perro;


// @author Valentin Mathey

public class EJ1 {

    public static void main(String[] args) {

        Animal perro1 = new Perro ("Stich", "Carnivoro", "Doberman", 15);
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", "Siamés", 15);
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", "Fino", 25);
        caballo1.Alimentarse();
        
    }

}
