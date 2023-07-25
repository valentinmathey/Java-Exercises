
package guia9.entindades;


// @author Valentin Mathey
 
public class jugador {

    //utilidad
    private String id;
    private String nombre;
    private Boolean mojado = false;
    
    //constructor
    public jugador(String id) {
        this.id = id;
        this.nombre = "Jugador " + String.valueOf(id);
    }
    
    //metodos
    public Boolean disparo(revolverAgua r){
        mojado = r.mojar();
        if (r.getPosicionActual()!= r.getPosicionAgua()) {
            r.siguienteChorro();
        }
        return mojado;
    }
    
    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
    
}
