
package guia7.servicios;

import guia7.entidad.Meses;
import java.util.Scanner;


// @author Valentin Mathey
 
public class EncontrarMes {
    Scanner leer = new Scanner(System.in);
    int cont1 = 1;
    

    public void adivinarMes(Meses meses1){
        String mesSecreto = meses1.getMeses1()[10], adivinador;
        do {            
            System.out.println("adivine el mes secreto " + "intento " + cont1);
            adivinador = leer.nextLine();
            if (mesSecreto.equalsIgnoreCase(adivinador)) {
                System.out.println("muy bien econtro el mes secreto");
                cont1 = 5;
            } else {
                cont1++;
            }
        } while (cont1 <= 3);
        
        if (cont1 == 4) {
            System.out.println("se terminaron los intentos posibles, el mes secreto era " + mesSecreto);
        }
    }
    
}
