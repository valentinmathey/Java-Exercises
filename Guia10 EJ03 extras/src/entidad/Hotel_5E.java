
package entidad;


public final class Hotel_5E extends Hotel_4E{
    
    private int cantSalasConf;
    private int cantSuit;
    private int cantLimos;

    public Hotel_5E() {
    }

    public Hotel_5E(int cantSalasConf, int cantSuit, int cantLimos, char gimnasio, String nombreRest, int capRest, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capRest, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalasConf = cantSalasConf;
        this.cantSuit = cantSuit;
        this.cantLimos = cantLimos;
    }

    @Override
    public double calcularPrecioHabitaciones() {
       
        double aux = super.calcularPrecioHabitaciones();
        
//        double sumaR = 0;
//        double sumaG = 0;
        double sumaL = 15 * cantLimos;
//        
//        int capHotel = (numCamas * cantHabitaciones) * cantPisos;
//        
//        if (capRest < 30) {
//            sumaR = sumaR + 10;
//        } else if (capRest >= 30 && capRest <=50){
//            sumaR = sumaR + 30;
//        } else if (capRest > 50){
//            sumaR = sumaR + 50;
//        }
//        
//        if (gimnasio == 'A') {
//            sumaG = sumaG + 50;
//        } else if (gimnasio == 'B'){
//            sumaG = sumaG + 30;
//        }
        
        double resultado = aux + sumaL;
        
        precioHabitaciones = resultado;
        
        return resultado;
    }
    
}
