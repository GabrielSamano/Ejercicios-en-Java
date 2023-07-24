import java.util.HashMap;

public class hash{
    public static void main(String[] args) {
        // Creacion de objeto con clave y valores
        HashMap<String, String> capitalCity = new HashMap<String, String>();
        // Agregando claves y valores al objeto capitalCity
        capitalCity.put("Inglaterra", "Londres");
        capitalCity.put("Mexico", "Ciudad de Mexico");
        capitalCity.put("USA", "Washington");
        capitalCity.put("Alemania", "Berlin");
        System.out.println(capitalCity);
        // se utiliza size para saber cuantos elementos hay
        System.out.println(capitalCity.size());
        //Bucle for para recorrer los elementos del hashmap
        for (String i : capitalCity.keySet()) {
            System.out.println(i);
          }
          for (String i : capitalCity.values()) {
            System.out.println(i);
          }
          for (String i : capitalCity.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCity.get(i));
          }
    }
}
