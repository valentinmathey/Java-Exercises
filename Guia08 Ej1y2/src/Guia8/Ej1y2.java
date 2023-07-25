package Guia8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

// @author Valentin Mathey
public class Ej1y2 {

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String salir;
        
        do {
            System.out.println("ingese una raza de perro");
            String raza = leer.nextLine();
            perros.add(raza);
            System.out.println("Desea agregar otra raza?");
            salir = leer.nextLine();
        } while (salir.equalsIgnoreCase("si"));
        
        Iterator<String> it = perros.iterator();
        System.out.println(perros);
        System.out.println("ingrese una raza a eliminar: ");
        String preg = leer.nextLine();
        
        while (it.hasNext()) {
            String preg2 = it.next();
            if (preg2.equals(preg)) {
                it.remove();
            }
        }

        /*
        (OTRA FORMA DE RESOLVER EL EJERCICIO)
        for (Iterator<String> iterator = perros.iterator(); iterator.hasNext();) {
            String preg2 = iterator.next();
        if (preg2.equalsIgnoreCase(preg)) {
            
            iterator.remove();
        }
        }
         */
        Collections.sort(perros);
        System.out.println(perros);

    }

}
