
package guia8.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


// @author Valentin Mathey
 
public class metodoPaises {
    //utilidad
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    Iterator<String> it;
    
    //array
    HashSet<String> paises = new HashSet<>(); //creamos un conjunto de tipo hashSet
    
    public void menu (){
        //variables
        Boolean vf = true;
        int opc;
        
        System.out.println("Bienvenidos al programa de paises");
        do {            
            System.out.println(" ");
            System.out.println("1 - Ingresar paises");
            System.out.println("2 - Eliminar paises");
            System.out.println("3 - Mostrar paises");
            System.out.println("4 - Ordenar paises alfabeticamente");
            System.out.println("5 - Salir");
            System.out.println("Ingrese una opcion: ");
            opc = leer.nextInt(); 
            
            switch (opc) {
                case 1 -> ingresarPaises();
                case 2 -> eliminarPaises();
                case 3 -> mostrarPaises();
                case 4 -> ordenarPaises();
                case 5 -> vf = false;
                default -> System.out.println("Opcion ingresada incorrecta, intente de nuevo");
            } 
        } while (vf);
    }
    
    private void ingresarPaises (){
        String pais, salir;
        do {            
            System.out.println("Ingrese el pais a agregar");
            pais = leer2.nextLine();
            paises.add(pais);
            System.out.println("Quiere agregar mas paises SI / NO");
            salir = leer2.nextLine();
        } while (salir.equalsIgnoreCase("SI"));
        System.out.println("Paises agregados");
    }
    
    private void eliminarPaises (){
        it = paises.iterator();
        String remove, salir;
        do { 
            int cont = 0;
            System.out.println("Pais que desea ingresar");
            remove = leer2.nextLine();
            while (it.hasNext()) {   
                if (it.next().equalsIgnoreCase(remove)) {
                    it.remove();
                    System.out.println("Pais eliminido");
                    cont++;
                }
            }
            if (cont == 0) {
                System.out.println("No se encontro el pais a eliminar");
            }
            System.out.println("Quiere eliminar un pais mas SI / NO");
            salir = leer2.nextLine();
        } while (salir.equalsIgnoreCase("SI"));
            
    }
    
    private void mostrarPaises (){
        System.out.println(paises);
    }
    
    private void ordenarPaises (){
        ArrayList<String> paisesAux1 = new ArrayList<>(paises);
        Collections.sort(paisesAux1);
        System.out.println(paisesAux1);
    }
    
    /*
    private HashSet<String> ordenarPaises (){
        ArrayList<String> paisesAux1 = new ArrayList<>(paises);
        Collections.sort(paisesAux1);
        HashSet<String> paisesAux2 = new HashSet<>(paisesAux1);
        return paisesAux2;
        
    }
    */ 

}
