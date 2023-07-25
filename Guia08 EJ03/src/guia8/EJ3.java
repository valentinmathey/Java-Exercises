
package guia8;

import guia8.entidades.Alumno;
import guia8.servicio.metodoAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


// @author Valentin Mathey

public class EJ3 {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        metodoAlumno metodos = new metodoAlumno();
        Scanner leer = new Scanner(System.in);
        String salir, preg;
        int cont1;
        Double notaProm;
        Boolean vf;
        
        do {            
            Alumno alumno = metodos.crearAlumno();
            alumnos.add(alumno);
            System.out.println("Desea agregar otro alumno? si / no");
            salir = leer.nextLine();
            vf = salir.equalsIgnoreCase("si");
        } while (vf);
        
        Iterator<Alumno> it;
        
        do {
            cont1 = 0;
            it = alumnos.listIterator();
            System.out.println("nombre del alumno a calcular");
            preg = leer.nextLine();
            while (it.hasNext()) {
                Alumno alumnoAux = it.next();
                if (alumnoAux.getNombre().equals(preg)) {
                    cont1++;
                    notaProm = metodos.notaFinal(alumnoAux);
                    System.out.println("La nota final del alumno " + alumnoAux.getNombre() + " es: " + notaProm);
                } 
            }
            if (cont1 == 0) {
                System.out.println("No se encuentra el alumno");
            }
            System.out.println("Desea calcular las notas de otro alumno? si / no");
            salir = leer.nextLine();
            vf = salir.equalsIgnoreCase("si");
        } while (vf);

    }

}

