
package entidad;


public final class Camping extends AlojamientoExtraH{
    
    private int capMaxCarpas;
    private int cantBanios;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean restaurant, boolean privado, double mt2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mt2, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    

   

    
    
    
    
}
