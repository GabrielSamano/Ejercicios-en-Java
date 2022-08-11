import java.util.ArrayList;
import java.util.Iterator;;


public class Iteradores{
    public static void main(String[] args) {
        // Haciendo una coleccion
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");

        // Obteniendo el iterador
        Iterator<String> it = cars.iterator();

        // Imprimiendo el primer objeto
        System.out.println(it.next());
    }

}