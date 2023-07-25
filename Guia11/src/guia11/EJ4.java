
package guia11;

import java.util.InputMismatchException;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer resultado;
        
        try {
            System.out.println("Ingrese el primer numero");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero");
            int num2 = leer.nextInt();
        
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
            
        } catch (InputMismatchException e1) {
            System.out.println("Un dato tipo entero no puede contener letras o simbolos");
            
        } catch (ArithmeticException e2){
            System.out.println("No es posible dividir por cero");
            
        }
    }

}
