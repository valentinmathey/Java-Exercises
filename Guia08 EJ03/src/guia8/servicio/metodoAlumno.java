
package guia8.servicio;

import guia8.entidades.Alumno;
import java.util.Scanner;


// @author Valentin Mathey
 
public class metodoAlumno {

    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    public Alumno crearAlumno(){ 
      String nombre;
      Integer n1,n2,n3;
      
           System.out.println("ingrese el nombre del alumno a ingresar: ");
           nombre = leer1.nextLine();
           System.out.println("ingese la nota 1 de "+nombre+": ");
           n1 = leer2.nextInt();
           System.out.println("ingese la nota 2 de "+nombre+": ");
           n2 = leer2.nextInt();
           System.out.println("ingese la nota 3 de "+nombre+": ");
           n3 = leer2.nextInt();
           return new Alumno(nombre,n1,n2,n3);    
    }
    
    public Double notaFinal(Alumno alumnoAux){
        Double notaProm;
        notaProm = (double)((alumnoAux.getN1() + alumnoAux.getN2() + alumnoAux.getN3()) / 3);
        return notaProm;
    }
}
