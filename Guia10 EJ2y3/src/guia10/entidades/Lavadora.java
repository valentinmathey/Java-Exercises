
package guia10.entidades;


// @author Valentin Mathey
 
public class Lavadora extends Electrodomesticos{
//atributos
    protected int carga;

    //constructores
    public Lavadora() {

    }

    public Lavadora(int carga, String tipo, String color, String consumo, int precio, int peso) {
        super(tipo, color, consumo, precio, peso);
        this.carga = carga;
    }


    //metodos
    public void crearLavadora(){
        tipo = "Lavadora";
        System.out.println("\nVamos a crear una Lavadora");
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        carga = leer.nextInt();
        precio = this.precioFinal(carga);
        System.out.println("\nEl precio de la lavadora es: " + precio + "$");
    }
    
    private int precioFinal(int carga){
        precio = (super.precioFinal(consumo, peso));
        if (carga > 30) {
            precio = (precio + 500);
        }
        return precio;
    }
    
    //getter and setter
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + " carga=" + carga + '}';
    }
}
