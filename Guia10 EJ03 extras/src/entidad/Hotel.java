
package entidad;


public abstract class Hotel extends Alojamiento{
    
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    

    
    public abstract double calcularPrecioHabitaciones();
    
}
