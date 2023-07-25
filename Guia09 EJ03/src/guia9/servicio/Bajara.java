package guia9.servicio;

import guia9.entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// @author Valentin Mathey
public class Bajara {
    //llamadas
    ArrayList<Carta> baraja = new ArrayList();
    String[] palos = {"Espada", "Basto", "Oro", "Copa"};

    //utilidad
    // Scanner leer = new Scanner(System.in).useDelimiter("\n"); (OPCION PARA ARREGLAR EL SCANNER)
    Scanner leer = new Scanner(System.in);
    
    //atributos
    int posicionBaraja = 0;
    
    //metodos
    private void llenarBaraja() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
              if (j != 8 && j != 9) {
               Carta carta = new Carta(j, palos[i]); 
               baraja.add(carta);
               }   
            }  
        }
        System.out.println("BARAJA LLENA - QUE EMPIECE EL JUEGO");
    }
    
    public void menu() {
        //variables
        int opc;
        Boolean vf = true;
        
        llenarBaraja();
        
        do {
            System.out.println(" ");
            System.out.println("1 - Barajar ");
            System.out.println("2 - Siguiente carta ");
            System.out.println("3 - Cartas disponibles");
            System.out.println("4 - Dar cartas ");
            System.out.println("5 - Mostrar cartas que ya salieron");
            System.out.println("6 - Mostrar baraja");
            System.out.println("7 - Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1 -> barajar();
                case 2 -> siguienteCarta();
                case 3 -> cartasDisponibles(0);
                case 4 -> darCartas();
                case 5 -> cartasMonton();
                case 6 -> mostrarBaraja();
                case 7 -> vf = false;
                default -> System.out.println("Opcion ingresada incorrecta, intente de nuevo.");
            }
        } while (vf);
    }

    private void barajar() {
        Collections.shuffle(baraja);
    }

    private void siguienteCarta() {
        if (posicionBaraja == baraja.size()) {
            System.out.println("No hay mas cartas disponibles, se barajan las cartas nuevamente ");
            posicionBaraja = 0;
            barajar();
        } else {
            System.out.println(baraja.get(posicionBaraja));
            posicionBaraja++;
        }
    }

    private int cartasDisponibles(int i) {
        int cartasDisponibles = baraja.size() - posicionBaraja;
        if (i == 0) {
            System.out.println("El numero disponible de cartas a repartir es: " + cartasDisponibles);
        }
        return cartasDisponibles;
    }

    private void darCartas() {
        int cartasPedidas;
        System.out.println("Ingrese la cantidad de cartas a repartir");
        cartasPedidas = leer.nextInt();
        if (cartasPedidas > cartasDisponibles(1)) {
            System.out.println("El numero de cartas disponibles no es suficiente");
        } else {
            for (int i = posicionBaraja; i < cartasPedidas; i++) {
                System.out.println(baraja.get(i));
            }
            posicionBaraja += cartasPedidas;
        }
    }

    private void cartasMonton() {
        if (posicionBaraja == 0) {
            System.out.println("No se ha repartido niguna carta todavia");
        } else {
            for (int i = 0; i < posicionBaraja; i++) {
                System.out.println(baraja.get(i));
            }
        }
    }

    private void mostrarBaraja() {
        for (int i = posicionBaraja; i < baraja.size(); i++) {
            System.out.println(baraja.get(i));
        }
    }

    /*
    * Un metodo para poder rellenar la baraja
    private void llenarBaraja() {
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
               Carta carta = new Carta(i, "Espada"); 
               baraja.add(carta);
            }  
        }
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
               Carta carta = new Carta(i, "Basto"); 
               baraja.add(carta);
            }  
        }
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
               Carta carta = new Carta(i, "Oro"); 
               baraja.add(carta);
            }  
        }
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
               Carta carta = new Carta(i, "Copa"); 
               baraja.add(carta);
            }  
        }
        System.out.println("BARAJA LLENA - QUE EMPIECE EL JUEGO");
    }
    */
}
