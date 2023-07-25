
package entidad;


public final class Residencia extends AlojamientoExtraH{
    
    private int cantHabitaciones;
    private boolean desc;
    private boolean campDepor;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean desc, boolean campDepor, boolean privado, double mt2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mt2, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.desc = desc;
        this.campDepor = campDepor;
    }

    public boolean isDesc() {
        return desc;
    }

    public void setDesc(boolean desc) {
        this.desc = desc;
    }
    

  

    
    
    
}
