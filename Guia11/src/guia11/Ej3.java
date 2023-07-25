
package guia11;

import java.util.Scanner;


// @author Valentin Mathey

public class Ej3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer n1, n2, resultado;
        
        
        
        try {
            System.out.println("Ingrese el primer numero");
            String num1 = leer.next();
            System.out.println("Ingrese el segundo numero");
            String num2 = leer.next();
            
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
        
            resultado = n1 / n2;
            System.out.println("El resultado es: " + resultado);
//            
//        } catch (NumberFormatException e1) {
//            System.out.println("No puede contener caracteres");
//            
//        } catch (ArithmeticException e2){
//            System.out.println("No es posible dividir por cero");
//            
        } catch (Exception e3){
            e3.notifyAll();
        }
        
    }

}
