
package entidad;


public class Hotel_4E extends Hotel{
    
    protected char gimnasio;
    protected String nombreRest;
    protected int capRest;

    public Hotel_4E() {
    }

    public Hotel_4E(char gimnasio, String nombreRest, int capRest, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capRest = capRest;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapRest() {
        return capRest;
    }

    public void setCapRest(int capRest) {
        this.capRest = capRest;
    }
    
    
    
    @Override
    public double calcularPrecioHabitaciones() {
        
        double sumaR = 0;
        double sumaG = 0;
        int capHotel = (numCamas * cantHabitaciones) * cantPisos;
        
        if (capRest < 30) {
            sumaR = sumaR + 10;
        } else if (capRest >= 30 && capRest <=50){
            sumaR = sumaR + 30;
        } else if (capRest > 50){
            sumaR = sumaR + 50;
        }
        
        if (gimnasio == 'A') {
            sumaG = sumaG + 50;
        } else if (gimnasio == 'B'){
            sumaG = sumaG + 30;
        }
        
        double resultado = 50 + (1 * capHotel ) + sumaR + sumaG;
        
        precioHabitaciones = resultado;
        
        System.out.println(resultado);
        return resultado;
    }
    
    

}
