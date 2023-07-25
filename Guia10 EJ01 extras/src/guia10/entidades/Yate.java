
package guia10.entidades;


// @author Valentin Mathey
 
public class Yate extends Barco{
    
    //atributos
    protected int potencia, camarotes;
    private final int precioPotencia = 2, precioCamarotes = 100; //defino precio por unidad de cada variable

    //constructores
    public Yate() {
    }

    public Yate(int potencia, int camarotes, String tipo, String matricula, int eslora, int anioFabricacion, Alquiler alquiler) {
        super(tipo, matricula, eslora, anioFabricacion, alquiler);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    
    //metodos
    public void crearYate(Barco b1, Alquiler a1){
        tipo = "Yate";
        System.out.println("\nVamos a crear un Yate");
        System.out.println("Ingrese la potencia en CV");
        potencia = leer.nextInt();
        System.out.println("Ingrese la cantidad de camarotes");
        camarotes = leer.nextInt();
        super.crearBarco(b1, a1);
    }
    
    public void calcularPrecioYate(Barco b1){
        int precioAux = super.calcularPrecio(b1);
        b1.getAlquiler().setPrecioAlquiler(precioAux + b1.getAlquiler().getPrecioAlquiler() + (potencia * precioPotencia) + (camarotes * precioCamarotes));
        System.out.println("El precio del alquiler para el Yate es de " + b1.getAlquiler().getPrecioAlquiler() + "$");
    }
    
    //getter and setter
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    


}
