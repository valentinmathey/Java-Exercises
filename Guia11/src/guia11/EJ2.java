
package guia11;


// @author Valentin Mathey

public class EJ2 {

    public static void main(String[] args) {

        String[] nombres = {"juan", "pedro", "nico", "jorge", "valentin"};
        
        try {
            for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + (i+1) + " " + nombres[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se quiere ingresar a una posicion fuera del array");
        }
        
    }

}
