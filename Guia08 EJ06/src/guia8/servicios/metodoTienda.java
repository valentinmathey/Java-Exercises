
package guia8.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// @author VALENTIN

public class metodoTienda {
    //utilidad
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    //colections
    HashMap <String, Double> productos = new HashMap();
    
    public void menu(){
        Boolean vf = true;
        int opc;
        System.out.println("Bienvenidos a la tienda de Valentin");
        do {   
            System.out.println(" ");
            System.out.println("Ingrese una opcion");
            System.out.println("1 - Agregar productos a la tienda");
            System.out.println("2 - Eliminar productos de la tienda");
            System.out.println("3 - Actualizar producto de la tienda");
            System.out.println("4 - Mostra productos de la tienda");
            System.out.println("");
            System.out.println("5 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarProducto(); break;
                case 2:
                    eliminarProducto(); break;
                case 3:
                    modificarPrecio(); break;
                case 4:
                    mostrarProductos(); break;
                case 5:
                    vf = false; break;
                default:
                    System.out.println("Opcion incorrecta, vuelva a ingresar otra opcion");
            }
        } while (vf);
    }
    
    private void agregarProducto(){
        Double precio;
        String nombre, salir;
        do {
            System.out.println("Ingrese el nombre del producto");
            nombre = leer2.nextLine();
            System.out.println("Ingrese el precio del producto");
            precio = leer.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Desea agregar otro elemento SI / NO");
            salir = leer2.nextLine();
        } while(salir.equalsIgnoreCase("SI"));
        
    }
    
    private void eliminarProducto(){
        String borrar, salir;
        int cont;
        do {
            cont = 0;
            System.out.println("Ingrese el nombre del producto a borrar");
            borrar = leer2.nextLine();
            for (Object nombre : productos.keySet()) {
                if (nombre.equals(borrar)) {
                productos.remove(borrar);
                cont++;
                System.out.println("Producto eliminado");
                }
            }
            if (cont == 0) {
                System.out.println("No se encontro el producto");
            }
            System.out.println("Desea eliminar otro elemento SI / NO");
            salir = leer2.nextLine();
        } while (salir.equalsIgnoreCase("SI"));
    }
    
    private void modificarPrecio(){
        String borrar, salir;
        int cont;
        Double nuevoPrecio;
        do {
            cont = 0;
            System.out.println("Ingrese el nombre del producto a actualizar");
            borrar = leer2.nextLine();
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(borrar)) {
                    System.out.println("Ingrese el precio actualizado");
                    nuevoPrecio = leer.nextDouble();
                    entry.setValue(nuevoPrecio);
                    cont++;
                    System.out.println("Precio actualizado");
                }
            }
            if (cont == 0) {
                System.out.println("No se encontro el producto");
            }
            System.out.println("Desea actualizar otro producto SI / NO");
            salir = leer2.nextLine();
        } while (salir.equalsIgnoreCase("SI"));
    }
    
    private void mostrarProductos(){
        int i = 1;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto " + i + ": " + entry.getKey() + " precio: $" + entry.getValue()); 
            i++;
        }
    }
}
