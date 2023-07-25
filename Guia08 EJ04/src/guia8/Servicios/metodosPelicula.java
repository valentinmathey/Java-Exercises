
package guia8.Servicios;

import guia8.Entindades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey
 
public class metodosPelicula {
    //llamadas
    ArrayList<Pelicula> ListaPeli = new ArrayList();
    
    //utilidad
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    //variables
    String titulo,autor;
    Double hora;
    int opc;
    
    public void menu(){
        Boolean vf = true;
        
        do { 
            System.out.println(" ");
            System.out.println("1 - Ingresar Pelicular.");
            System.out.println("2 - Mostrar peliculas.");
            System.out.println("3 - Mostrar peliculas > 1hr.");
            System.out.println("4 - Ordenar peliculas de mayor a menor.");
            System.out.println("5 - Ordenar peliculas de menor a mayor.");
            System.out.println("6 - Ordenar peliculas por titulo.");
            System.out.println("7 - Ordenar peliculas por director.");
            System.out.println("8 - Salir.");
            System.out.println("Ingrese una opcion: ");
            opc = leer.nextInt(); 
        
            switch (opc) {
                case 1 -> crearPeli();
                case 2 -> mostrarPelis();
                case 3 -> mostrarPelis2();
                case 4 -> ordenarMayor();
                case 5 -> ordenarMenor();
                case 6 -> ordenarTitulo();
                case 7 -> ordenarDirector();
                case 8 -> vf = false;
                default -> System.out.println("Opcion ingresada incorrecta, intente de nuevo.");
            }
        } while (vf);
    }
    
    private void crearPeli(){
        String salir;
        Boolean vf2;
        
        do {
        System.out.println(" ");
        System.out.println("ingrese el titulo de la pelicula: ");
        titulo = leer2.nextLine();
        System.out.println("ingrese el autor de '"+titulo+"': ");
        autor = leer2.nextLine();
        System.out.println("ingrese la duracion de '"+titulo+"': ");
        hora = leer.nextDouble();
        Pelicula newPeli = new Pelicula(titulo, autor, hora); //crea un nuevo objeto Pelicula con el uso del constructor
        ListaPeli.add(newPeli); //lo agrega al arraylist
        System.out.println("Pelicula Creada!!!");
        System.out.println(" ");
        System.out.println("Desea ingresar otra pelicual? si/no");
        salir = leer2.nextLine();
        vf2 = salir.equalsIgnoreCase("si");
        } while (vf2);    
    }
    
    private void mostrarPelis(){
        //directamente se iguala al metodo ToString de la clase pelicula y lo muestra
        
        ListaPeli.forEach((mostrar) -> {
            System.out.println(mostrar);
        });
    }
    
    private void mostrarPelis2(){
        //muestra solo las peliculas con duracion mayor a 1 hora con el metodo ToString
        
        ListaPeli.stream().filter((mostrar) -> (mostrar.getHoras() > 1)).forEachOrdered((mostrar) -> {
            System.out.println(mostrar);
        });   
    }
    
    private void ordenarMayor(){
        System.out.println("Lista ordenada de mayor a menor");
        System.out.println(" ");
        ListaPeli.sort(Pelicula.ordenarDuracionMayoraMenor); //llama al comparator de la clase Pelicula
        ListaPeli.forEach((mostrar) -> {
            System.out.println(mostrar);
        });
    }
    
    private void ordenarMenor(){
        System.out.println("Lista ordenada de menor a mayor");
        System.out.println(" ");
        ListaPeli.sort(Pelicula.ordenarDuracionMenoraMayor); //llama al comparator de la clase Pelicula
        ListaPeli.forEach((mostrar) ->{
            System.out.println(mostrar);
        });
    }
    
    private void ordenarTitulo(){
        System.out.println("Lista ordenada por Titulo");
        System.out.println(" ");
        ListaPeli.sort(Pelicula.ordenarTitulo); //llama al comparator de la clase Pelicula
        ListaPeli.forEach((mostrar) ->{
            System.out.println(mostrar);
        });   
    }
    
    private void ordenarDirector(){
        System.out.println("Lista ordenada por Directores");
        System.out.println(" ");
        ListaPeli.sort(Pelicula.ordenarDirector); //llama al comparator de la clase Pelicula
        ListaPeli.forEach((mostrar) ->{
            System.out.println(mostrar);  
        });
    }
}
