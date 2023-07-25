
package guia10.entidades;


// @author Valentin Mathey
 
public class Televisor extends Electrodomesticos{
    
    //atributos
    protected int resolucion;
    protected Boolean  tdt;
    
    //constructores
    public Televisor() {
    }

    public Televisor(int resolucion, Boolean tdt, String tipo, String color, String consumo, int precio, int peso) {
        super(tipo, color, consumo, precio, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    //metodos
    public void crearTelevision(){
        String aux;
        tipo = "Televisor";
        System.out.println("\nVamos a crear un Televisor");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion");
        resolucion = leer.nextInt();
        System.out.println("Tiene TDT SI/NO");
        aux = leer.next();
        tdt = aux.equalsIgnoreCase("SI");
        precio = precioFinal();
        System.out.println("\nEl precio del televisor es: " + precio + "$");
    }
    
    private int precioFinal(){
        precio = (super.precioFinal(consumo, peso));
        if (resolucion > 40) {
            precio = (precio*30) / 100; 
        }
        if (tdt) {
            precio += 500;
        }
        return precio;
    }
    
    //getter y setter

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }
    
    @Override
    public String toString() {
        return "Televisor{" + super.toString() + " resolucion=" + resolucion + " TDT=" + tdt + '}';
    }
}
