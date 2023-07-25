
package guia10.entidades;


// @author Valentin Mathey
 
public class BarcoMotor extends Barco{
    
    //atributos
    protected int potencia;
    private final int precioPotencia = 2; //defino precio por unidad de cada variable

    //constructores
    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String tipo, String matricula, int eslora, int anioFabricacion, Alquiler alquiler) {
        super(tipo, matricula, eslora, anioFabricacion, alquiler);
        this.potencia = potencia;
    }

    //metodos
    public void crearBarcoMotor(Barco b1, Alquiler a1){
        tipo = "BarcoMotor";
        System.out.println("\nVamos a crear un Barco a Motor");
        System.out.println("Ingrese la potencia en CV");
        potencia = leer.nextInt();
        super.crearBarco(b1, a1);
    }
    
    public void calcularPrecioBarcoMotor(Barco b1){
        int precioAux = super.calcularPrecio(b1);
        b1.getAlquiler().setPrecioAlquiler(precioAux + b1.getAlquiler().getPrecioAlquiler() + (potencia * precioPotencia));
        System.out.println("El precio del alquiler para el Yate es de " + b1.getAlquiler().getPrecioAlquiler() + "$");
    }
    
    //getter and setter
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    



    

}
