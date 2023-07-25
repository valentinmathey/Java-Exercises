
package guia9.servicio;

import guia9.entidades.Perro;
import guia9.entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


// @author Valentin Mathey
 
public class Metodos {
    //utilidad
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //metodos
    public Perro crearPerro(int i){
        //utilidad
        int opc;
        String[] tamanios = Perro.tamanios;
        Perro mascota = new Perro();
 
        System.out.println("\nIngrese los datos de la mascota " + (i+1) + "\n");
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
        //utilidad
        Persona persona = new Persona();
        Perro perroAux = new Perro(" ");
        
        System.out.println("\nIngrese los datos de la persona " + (i+1) + "\n");
        System.out.println("Ingrese el nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI: ");
        persona.setDni(leer.next());
        persona.setMascota(perroAux);
        return persona;
    }
    
    public void asignarMascota(ArrayList<Persona> Duenios, ArrayList<Perro> Mascotas){
        //utilidad
        String buscado;
        int cont = 1;
        
        for (Persona aux : Duenios) {
            System.out.println("\nIngrese el nombre del perrro para adoptar de la persona " + cont);
            buscado = leer.next();
            while (buscarMascota(Duenios, Mascotas, buscado)) {                
                System.out.println("\nIngrese nuevamente el nombre del perro");
                buscado = leer.next();
            }
            aux.setMascota(Mascotas.get(buscarIndice(Mascotas, buscado)));
            System.out.println("\nEl perro se asigno correctamente");
            cont++;
        } 
    }
    
    public void mostrarPersonas(ArrayList<Persona> Duenios){
        for (int i = 0; i < Duenios.size(); i++) {
            System.out.println(Duenios.get(i).toString(i));
        }  
    }
    
    private Boolean buscarMascota(ArrayList<Persona> Duenios, ArrayList<Perro> Mascotas, String buscado){
        //utilidad
        Boolean buscar = false;
        int cont = 0;
        Iterator<Persona> it = Duenios.iterator();
        
        for (Perro aux : Mascotas) {
            if(!aux.getNombre().equalsIgnoreCase(buscado)){
                cont++;
            } else {
                cont = 0; break;
            }
        }
        if (cont != 0) {
            buscar = true;
            System.out.println("\nEl perro no se encuentra en la lista de mascotas");
            return buscar;
        }
        for (int i = 0; i < Duenios.size(); i++) {
            Persona aux = it.next();
            if (buscado.equalsIgnoreCase(aux.getMascota().getNombre())) {
                buscar = true;
                System.out.println("\nEl perro ya se encuentra ocupado");
                i = Duenios.size();
            } else {
                buscar = false;
            }
        }
        return buscar;
    }
    
    private int buscarIndice(ArrayList<Perro> Mascotas, String buscado){
        //utilidad
        int indice = 0;
        
        for (Perro aux : Mascotas) {
            if(aux.getNombre().equalsIgnoreCase(buscado)){
                return indice;
            } else {
                indice++;
            }
        }
        return indice;
    }
    
    
}
