
package guia9.servicios;

import guia9.entindades.jugador;
import guia9.entindades.revolverAgua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


// @author Valentin Mathey
 
public class juego {
    //servicio
    Scanner leer2 = new Scanner(System.in);

    //utilidad
    private ArrayList<jugador> jugadores = new ArrayList<>();
    private revolverAgua r;
    
    //constructor

    public juego() {
    }
    
    //metodos
    public void llenarJuego(ArrayList<jugador> jugadores, revolverAgua r){
        this.jugadores = jugadores;
        this.r = r;
        ronda();
    }

    private void ronda(){
        Iterator<jugador> it;
        jugador aux;
        r.llenarRevolver();
        String vuelta = "si";
        System.out.println("QUE EMPIECE EL JUEGO\n");
        do{
           it = jugadores.listIterator();
            for (int i = 0; i < jugadores.size(); i++) {
                aux = it.next();
                if (aux.disparo(r)) {
                    System.out.println(aux.getNombre() + " ah sido mojado");
                    System.out.println("FIN DEL JUEGO");
                    i = jugadores.size();
                    vuelta = "no";
                } else {
                    System.out.println(aux.getNombre() + " sigue seco");
                }
            }
            if (vuelta.equalsIgnoreCase("si")) {
                System.out.println("\nQuieren dar otra vuelta si / no");
                vuelta = leer2.nextLine();
            }
                
        } while(vuelta.equalsIgnoreCase("si"));
                
        System.out.println(r.toString());
    }
    
    
}
