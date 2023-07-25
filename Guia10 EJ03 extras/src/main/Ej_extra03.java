package main;

import entidad.Alojamiento;
import entidad.Camping;
import entidad.Hotel;
import entidad.Hotel_4E;
import entidad.Hotel_5E;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import utilidades.Comparators;

public class Ej_extra03 {

    public static void main(String[] args) {

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        ArrayList<Hotel> hoteles = new ArrayList<>();

        Alojamiento h4 = new Hotel_4E('A', "Molto", 20, 30, 60, 3, 0, "Trebol", "Rivadavia 2484", "Mar del Plata", "Raul");
        Alojamiento h42 = new Hotel_4E('B', "Molto", 20, 30, 60, 3, 0, "Nova", "Rivadavia 2484", "Mar del Plata", "Raul");
        Alojamiento h5 = new Hotel_5E(2, 3, 4, 'B', "Maximo", 30, 50, 100, 3, 0, "Supera", "Lopez 2357", "Mar del Plata", "Miguel");
        Alojamiento h52 = new Hotel_5E(2, 3, 4, 'A', "Maximo", 30, 50, 100, 3, 0, "Sheraton", "Lopez 2357", "Mar del Plata", "Miguel");
        Alojamiento c = new Camping(10, 3, true, true, 200, "Colinas Verdes", "San Martin 4534", "Villa Gesel", "Juan");
        Alojamiento c2 = new Camping(10, 3, false, true, 100, "Estelar", "San Jorge 1234", "Villa Gesel", "Pedro");
        Alojamiento r = new Residencia(4, true, true, true, 50, "Los panas", "San Juan 7423", "Mar del Plata", "Pablo");
        Alojamiento r2 = new Residencia(4, false, true, true, 50, "Maximos", "San Juan 7423", "Mar del Plata", "Pablo");

        alojamientos.add(h4);
        alojamientos.add(h42);
        alojamientos.add(h5);
        alojamientos.add(h52);
        alojamientos.add(c);
        alojamientos.add(c2);
        alojamientos.add(r);
        alojamientos.add(r2);

        System.out.println("LISTA DE ALOJAMIENTOS: ");
        System.out.println("***********************");

//        for (Alojamiento aux : alojamientos) {
//            if (aux instanceof Hotel_5E object) {
//                System.out.println("Hoteles de 5 Estrellas:");
//                System.out.println(object.getNombre());
//                System.out.println("***************");
//                continue;
//            }
//            if (aux instanceof Hotel_4E object) {
//                System.out.println("Hoteles de 4 Estrellas:");
//                System.out.println(object.getNombre());
//                System.out.println("***************");
//            }
//            if (aux instanceof Camping object) {
//                System.out.println("Campings:");
//                System.out.println(object.getNombre());
//                System.out.println("***************");
//            }
//            if (aux instanceof Residencia object) {
//                System.out.println("Residencias:");
//                System.out.println(object.getNombre());
//            }
//        }


        System.out.println("Hoteles de 5 Estrellas:");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel_5E object) {
                System.out.println(object.getNombre());
            }
        }
        
        System.out.println("***********************");

        System.out.println("Hoteles de 4 Estrellas:");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel_5E) {
                continue;
            }
            if (aux instanceof Hotel_4E object) {
                System.out.println(object.getNombre());
            }
        }
        
        System.out.println("***********************");
        
        System.out.println("Campings:");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Camping object) {
                System.out.println(object.getNombre());
            }
        }
        
        System.out.println("***********************");
        
        System.out.println("Residencias:");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Residencia object) {
                System.out.println(object.getNombre());
            }
        }
        
        System.out.println("***********************");

        System.out.println("Lista de campings con restaurant:");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Camping campAux) {
                if (campAux.isRestaurant()) {
                    System.out.println(campAux.getNombre());
                }
            }
        }

        System.out.println("***********************");

        System.out.println("Lista de residencias con descuento:");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Residencia resAux) {
                if (resAux.isDesc()) {
                    System.out.println(resAux.getNombre());
                }
            }
        }

        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel hotelAux) {
                hotelAux.calcularPrecioHabitaciones();
            }
        }
        
        System.out.println("***********************");
        
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel hotelAux) {
                hoteles.add(hotelAux);
            }
        }
        
        Collections.sort(hoteles, Comparators.ordenarPorPrecio);
        
        for (Hotel aux : hoteles) {
            System.out.println(aux.getPrecioHabitaciones());
        }
        
    }

}
