package utilidades;

import entidad.Hotel;
import java.util.Comparator;

public class Comparators {

    public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            if (o1.getPrecioHabitaciones() < o2.getPrecioHabitaciones()) {
                return 1;
            } else if (o1.getPrecioHabitaciones() > o2.getPrecioHabitaciones()) {
                return -1;
            } else{
            return 0;
            }
        }
    };

}
