
package guia10.entidades;

import java.util.ArrayList;


// @author Valentin Mathey
 
public class Polideportivo extends Edificio{

    protected String nombre, tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, Double ancho, Double alto, Double largo, Double superficie, Double volumen, Double tipo) {
        super(ancho, alto, largo, superficie, volumen, tipo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public void crearPolideportivo(){
        tipo = 1.0;
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Que tipo de instalacion es Techado / Abierto");
        tipoInstalacion = leer.next();
        while (!tipoInstalacion.equalsIgnoreCase("Abierto") && !tipoInstalacion.equalsIgnoreCase("Techado")) {            
            System.out.println("Dato incorrecto, ingrese nuevamente el tipo de instalacion");
            tipoInstalacion = leer.next();
        }
        System.out.println("Ingrese la altura");
        alto = leer.nextDouble();
        System.out.println("Ingrese el ancho");
        ancho = leer.nextDouble();
        System.out.println("Ingrese largo");
        largo = leer.nextDouble();
        calcularSuperficie();
        calcularVolumne();
    }
    
    @Override
    public void verDatos(ArrayList<Edificio> Edificios){
        int techado = 0, abierto = 0;
        for (Edificio aux : Edificios) {
            if (aux.getTipo() == 1.0) {
                if (tipoInstalacion.equalsIgnoreCase("Techado")) {
                    techado++;
                } else {
                    abierto++;
                }
            }
        }
        System.out.println("La cantidad de Polideportivos techados es de " + techado);
        System.out.println("La cantidad de Polideportivos abiertos es de " + abierto);
        System.out.println(toString());
    }

    
    @Override
    public void calcularSuperficie() {
        superficie = largo * ancho;
    }

    @Override
    public void calcularVolumne() {
        volumen = largo * ancho * alto;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + super.toString();
    }

    
}
