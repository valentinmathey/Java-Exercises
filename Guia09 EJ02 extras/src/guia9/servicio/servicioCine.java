
package guia9.servicio;

import guia9.entidades.Cine;
import guia9.entidades.Espectador;
import guia9.entidades.Pelicula;
import guia9.entidades.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


// @author Valentin Mathey
 
public class servicioCine {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    //MENU
    public void menu() {
        //variables
        Boolean vf = true;
        int opc;
        Cine c = crearCine();
      
        do {
            System.out.println("\n1 - Agregar sala");
            System.out.println("2 - Agregar pelicula");
            System.out.println("3 - Eliminar pelicula");
            System.out.println("4 - Agregar espectador");
            System.out.println("5 - Mostrar salas");
            System.out.println("6 - Salir");
            System.out.println("\nIngrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1 -> crearSala(c.getSalas());
                case 2 -> crearPelicula(c.getPeliculas());
                case 3 -> eliminarPelicula(c.getPeliculas());
                case 4 -> crearEspectador(c.getSalas());
                case 5 -> mostrarSalas(c.getSalas());
                case 6 -> vf = false;
                default ->
                    System.out.println("\nOpcion ingresada incorrecta, intente de nuevo");
            }
        } while (vf);
    }
    
    //METDODOS PRIMARIOS
    private void crearSala(ArrayList<Sala> salas){
        Sala s = new Sala();
        int cantOcupados;
        String[] letra = Sala.letras;
        
        System.out.println("Ingrese el nombre de la sala");
        s.setNombre(leer.next());
        
        System.out.println("Ingrese la cantidad de personas dentro de la sala");
        cantOcupados = leer.nextInt();
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                s.getSalaCompleta()[i][j] = letra[j].concat(String.valueOf(i + 1));
            }
        }
        buscarButaca(s, cantOcupados);
        
        salas.add(s);
    }
    
    private void crearPelicula(ArrayList<Pelicula> peliculas) {
        String salir;

        do {
            Pelicula p = new Pelicula();
            System.out.print("Ingrese el titulo: ");
            p.setTitulo(leer.next());
            System.out.print("Director: ");
            p.setDirector(leer.next());
            System.out.print("Duracion: ");
            p.setDuracion(leer.nextInt());
            System.out.print("Edad minima: ");
            p.setEdadMinima(leer.nextInt());
            peliculas.add(p);
            System.out.println("Quiere agregar otra pelicula? SI / NO");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("SI"));
    }

    private void eliminarPelicula(ArrayList<Pelicula> peliculas) {
        String salir;
        
        do {
            System.out.print("Ingrese la pelicula a eliminar: ");
            String eliminar = leer.next();
            for (Pelicula aux : peliculas) {
                if (aux.getTitulo().equalsIgnoreCase(eliminar)) {
                    peliculas.remove(aux);
                }
            }
            System.out.println("Quiere eliminar otra pelicula? SI / NO");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("SI"));
    }
    
    private void crearEspectador(ArrayList<Sala> salas) {
        String salir;
        
        do{
            Espectador e = new Espectador();

            System.out.print("Nombre: ");
            e.setNombre(leer.next());
            System.out.print("Edad: ");
            e.setEdad(leer.nextInt());
            System.out.print("Dinero: ");
            e.setDinero(leer.nextInt());
            e.setSala(asignarSala(salas));
            e.getSala().getEspectadores().add(e);
            System.out.println("Quiere agregar otro espectador? SI / NO");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("SI"));
    }
    
    private void mostrarSalas(ArrayList<Sala> s){
        for (Sala aux : s) {
            System.out.print(" [" + aux.getNombre() + "] ");
        }
    }

    //METODOS SECUNDARIOS
    private Cine crearCine(){
        Cine c = new Cine();
        System.out.println("BIENVENIDOS AL CREADOR DE CINE\n");
        System.out.println("Defina el precio de la entrada");
        c.setPrecio(leer.nextInt());
        return c;
    }
    
    private void buscarButaca(Sala s, int cantPersonas){
        Random butaca = new Random();
        String columna;
        int fila;
        Boolean vf;
        String[] letra = Sala.letras;
        
        for (int i = 0; i < cantPersonas; i++) {
            do{
                if (cantPersonas == 1) {
                    mostrarSala(s);
                    System.out.println("\nElija el lugar a ocupar\n");
                    System.out.println("Fila: ");
                    fila = leer.nextInt();
                    while (fila < 1 || fila > 8) {                        
                        System.out.println("ingrese nuevamente la fila");
                        fila = leer.nextInt();
                    }
                    System.out.println("Columna: ");
                    columna = leer.next();
                    vf = buscarLugar(s, (fila-1), buscarColumna(letra, columna));
                } else {
                    vf  = buscarLugar(s, butaca.nextInt(8), butaca.nextInt(6)); 
                }
            } while (vf);                 
        } 
    }
    
    private Boolean buscarLugar(Sala s, int fila, int columna){
        if (s.getSalaCompleta()[fila][columna].equalsIgnoreCase("X")) {
            System.out.println("Lugar ocupado");
            return true;
        } else {
            System.out.println("Lugar asignado");
            s.getSalaCompleta()[fila][columna] = "X";
            return false;
            
        }
    }
    
    private int buscarColumna(String[] letra, String columna){
        int aux = 0;
        for (String letra1 : letra) {
            if (letra1.equalsIgnoreCase(columna)) {
                return aux;
            } else {
                aux++;
            }
        }
        return aux;
    }
    
    private Sala asignarSala(ArrayList<Sala> salas){  
        int cont;
        String sala;
        Sala salida = new Sala();
        
        if (salas.isEmpty()) {
            System.out.println("Todavia no hay ninguna sala creada, cree una sala antes");
            crearSala(salas);
        }
        
        do {
                cont = 0;
                System.out.println("Ingrese el nombre de la sala");
                System.out.print("Salas disponibles: ");
                for (Sala aux : salas) {
                    System.out.print("[" + aux.getNombre() + "] ");
                }
                sala = leer.next();
                for (Sala aux : salas) {
                    if (aux.getNombre().equalsIgnoreCase(sala)) {
                        cont++;
                        salida = aux;
                        buscarButaca(aux, 1);
                        break;
                    }
                }
                if (cont == 0) {
                    System.out.println("nombre incorrecto, ingrese nuevamente la sala"); 
                }
            } while (cont == 0);
        return salida;
    }
    
    private void mostrarSala(Sala s){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + s.getSalaCompleta()[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
      
}
