
package guia7.servicio;

import guia7.entidad.Ahorcado;
import java.util.Scanner;


// @author Valentin Mathey
 
public class iniciarJuego {
    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    public void juego(Ahorcado palabra1){
        String letras = " ";
        
        crearJuego(palabra1);
        longitud(palabra1);
        do {            
            String letra = buscar(palabra1);
            for (int i = 0; i < palabra1.getPalabra().length; i++) {
                System.out.print(palabra1.getPalabraAux()[i]);
            }
            if (palabra1.getEncontradas() < palabra1.getPalabra().length) {
                letras = letras.concat(letra + " ");
                System.out.println("\nletras ya uasadas " + letras);
                intentos(palabra1);
            } else {
                System.out.println(" ");
                System.out.println("genial encontro la palabra"); 
            }
            
        } while (palabra1.getEncontradas() < palabra1.getPalabra().length && palabra1.getJugadas() > 0);
            
    }
    
    private void crearJuego(Ahorcado palabra1){
        System.out.println("elija la cantidad de errores");
        palabra1.setJugadas(leer1.nextInt());
        System.out.println("escriba la palabra a encontrar");
        String aux = leer2.nextLine();
        palabra1.setPalabra(new String[aux.length()]);
        palabra1.setPalabraAux(new String[aux.length()]);
        for (int i = 0; i < aux.length(); i++) {
            palabra1.getPalabra()[i] = (aux.substring(i, i+1)); 
            palabra1.getPalabraAux()[i] = ("*");
        }
    }
    
    private void longitud(Ahorcado palabra1){
        System.out.println("la palabra a buscar tiene " + palabra1.getPalabra().length + " letras");
    }
    
    private String buscar(Ahorcado palabra1){
        Boolean vf = true;
        System.out.println("escriba una letra");
        String letra = leer2.nextLine();
        for (int i = 0; i < palabra1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(palabra1.getPalabra()[i])) {
                palabra1.getPalabraAux()[i] = letra;
                palabra1.setEncontradas(palabra1.getEncontradas()+ 1);
                System.out.println("letra encontrada");
                vf = false;
            }   
        }
        if (vf) {
            palabra1.setJugadas(palabra1.getJugadas() - 1);
            System.out.println("letra incorrecta");
        }
        return letra;
    }
    
    private void intentos(Ahorcado palabra1){
        System.out.println(" ");
        if (palabra1.getJugadas()>0) {
            System.out.println("le quedan " + palabra1.getJugadas() + " intentos para completar la palabra");
            System.out.println("________________________________");
        } else {
            System.out.print("ya no te quedan intentos, la palabra secreta era: ");
            for (int i = 0; i < palabra1.getPalabra().length; i++) {
                System.out.print(palabra1.getPalabra()[i]);
            }
            System.out.println(" ");
        }  
    }
    
}
