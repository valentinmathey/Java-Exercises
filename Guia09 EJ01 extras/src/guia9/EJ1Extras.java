
package guia9;

import guia9.entidades.Perro;
import guia9.entidades.Persona;
import guia9.servicio.Metodos;
import java.util.ArrayList;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ1Extras {

    public static void main(String[] args) {
        //servicio
        Scanner leer = new Scanner(System.in); 
        
        //utilidad
        ArrayList<Persona> Duenios = new ArrayList<>();
        ArrayList<Perro> Mascotas = new ArrayList<>();
        Metodos mt = new Metodos();
        
        //variables
        int cant;
        
        System.out.println("Ingrese la cantidad de personas y perros a crear");
        cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            Persona pj = mt.crearPersona(i);
            Duenios.add(pj);
            Perro pe = mt.crearPerro(i);
            Mascotas.add(pe);
        }
        
        mt.asignarMascota(Duenios, Mascotas);
        
        System.out.println("\nLas mascotas se asignaron con exito\n");
        
        mt.mostrarPersonas(Duenios);
    }

}
