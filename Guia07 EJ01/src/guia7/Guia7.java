
package guia7;

import Entidades.Libro;
import Servicios.MetodosLibro;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Guia7 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros a registrar: "));
        
        Libro book[] = new Libro[opc];
        
        Servicios.MetodosLibro carga =  new Servicios.MetodosLibro();
        
        
        carga.cargarLibro(book);
        carga.mostrarDatos(book);

        
        
        





    }
    
}
