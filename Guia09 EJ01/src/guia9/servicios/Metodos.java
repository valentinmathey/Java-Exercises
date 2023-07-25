
package guia9.servicios;

import guia9.entidades.Perro;
import guia9.entidades.Persona;
import java.util.Scanner;


// @author Valentin Mathey
 
public class Metodos {
    //utilidad
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //metodos
    private Perro crearPerro(){
        int opc;
        String[] tamanios = Perro.tamanios;
        Perro mascota = new Perro();
        
        System.out.println("\nIngrese los datos de su mascota\n");
        System.out.println("Ingrese el nombre: ");
        mascota.setNombre(leer.next());
        System.out.println("Ingrese la raza: ");
        mascota.setRaza(leer.next());
        System.out.println("Ingrese la edad: ");
        mascota.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño 1-Grande / 2-Mediano / 3-Chiquito");
        opc = leer.nextInt();
        while (opc < 1 || opc > 3) {            
            System.out.println("Ingrese nuevamente el tamaño: ");
            opc = leer.nextInt();
        }
        mascota.setTamanio(tamanios[opc-1]);
        return mascota;
    }
    
    public Persona crearPersona(int i){
        Persona persona = new Persona();
        System.out.println("Ingrese los datos de la persona " + (i+1) + "\n");
        System.out.println("Ingrese el nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI: ");
        persona.setDni(leer.next());
        persona.setMascota(crearPerro());
        return persona;
    }
}
