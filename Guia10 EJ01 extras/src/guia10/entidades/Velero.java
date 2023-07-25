
package guia10.entidades;


// @author Valentin Mathey
 
public class Velero extends Barco{
    
    //atributos
    protected int mastiles;
    private final int precioMastiles = 50; //defino precio por unidad de cada variable

    //constructores
    public Velero() {
    }

    public Velero(int mastiles, String tipo, String matricula, int eslora, int anioFabricacion, Alquiler alquiler) {
        super(tipo, matricula, eslora, anioFabricacion, alquiler);
        this.mastiles = mastiles;
    }

    //metodos
    public void crearVelero(Barco b1, Alquiler a1){
        tipo = "Velero";
        System.out.println("\nVamos a crear un Velero");
        System.out.println("Ingrese la cantidad de mastiles");
        mastiles = leer.nextInt();
        super.crearBarco(b1, a1);
    }
    
    public void calcularPrecioVelero(Barco b1){
        int precioAux = super.calcularPrecio(b1);
        b1.getAlquiler().setPrecioAlquiler(precioAux + b1.getAlquiler().getPrecioAlquiler() + (mastiles * precioMastiles));
        System.out.println("El precio del alquiler para el Yate es de " + b1.getAlquiler().getPrecioAlquiler() + "$");   
    }
    
    //getter and setter
    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    
    
    
}
