
package guia8.entidades;


// @author Valentin Mathey
 
public class Alumno {
    private String nombre;
    private Integer n1,n2,n3;

    public Alumno() {
    }

    public Alumno(String nombre, Integer n1, Integer n2, Integer n3) {
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public Integer getN3() {
        return n3;
    }

    public void setN3(Integer n3) {
        this.n3 = n3;
    }

}
