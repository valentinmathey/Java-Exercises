
package guia9;

import guia9.entindades.jugador;
import guia9.entindades.revolverAgua;
import guia9.servicios.juego;
import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ2 {

    public static void main(String[] args) {
        //servicio
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        
        //utilidad
        int cantJugadores;
        String id;
        revolverAgua r = new revolverAgua();
        juego juego = new juego();
        ArrayList<jugador> jugadores = new ArrayList<>();
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        cantJugadores = leer.nextInt();
        
        for (int i = 0; i < cantJugadores; i++) {
            System.out.println("Ingrese el ID del jugador: ");
            id = leer2.nextLine();
            jugador j = new jugador(id);
            jugadores.add(j);
        }
        
        juego.llenarJuego(jugadores, r);
        
    }

}
