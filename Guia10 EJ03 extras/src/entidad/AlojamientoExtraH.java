
package entidad;


public abstract class AlojamientoExtraH extends Alojamiento{
    
    private boolean privado;
    private double mt2;

    public AlojamientoExtraH() {
    }

    public AlojamientoExtraH(boolean privado, double mt2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mt2 = mt2;
    }

    
}
