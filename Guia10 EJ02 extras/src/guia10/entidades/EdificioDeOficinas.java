
package guia10.entidades;

import java.util.ArrayList;


// @author Valentin Mathey
 
public class EdificioDeOficinas extends Edificio{
    
    protected int numOficinas, personasPorOficina, numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int personasPorOficina, int numPisos, Double ancho, Double alto, Double largo, Double superficie, Double volumen, Double tipo) {
        super(ancho, alto, largo, superficie, volumen, tipo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    public void crearEdificio(){
        tipo = 2.0;
        System.out.println("Ingrese la cantidad de personas por oficina");
        personasPorOficina = leer.nextInt();
        System.out.println("Ingrese el numero de oficinas");
        numOficinas = leer.nextInt();
        System.out.println("Ingrese el numero de pisos");
        numPisos = leer.nextInt();
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
        int personasPorPiso, personasTotal;
        personasPorPiso = personasPorOficina * numOficinas;
        personasTotal = personasPorPiso * numPisos;
        System.out.println("La cantidad de personas por piso es de " + personasPorPiso + " personas");
        System.out.println("La cantidad de personas total es de " + personasTotal + " personas");
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
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", personasPorOficina=" + personasPorOficina + ", numPisos=" + numPisos + super.toString();
    }
    
    
    

}
