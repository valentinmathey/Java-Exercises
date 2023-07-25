
package guia7.servicio;

import guia7.entidad.NIF;
import java.util.Scanner;


// @author Valentin Mathey
 
public class ServicioNIF {
    Scanner leer = new Scanner(System.in);
    String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

    public void crearNIF(NIF nif1){
        System.out.println("escriba el  DNI sin puntos, solo numeros");
        nif1.setDni(leer.nextInt());
        System.out.println("resto " + nif1.getDni()%23);
        for (int i = 0; i < letras.length; i++) {
            if (i == (nif1.getDni()%23)) {
                nif1.setLetra(letras[i]);
            }
        } 
    }
    
    public void mostrar(NIF nif1){
        System.out.println(nif1.getDni() + "-" + nif1.getLetra());
    }
    
}
