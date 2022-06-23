// Arrays //
// Bucle en array //
public class J6 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] Mynum = {1,2,3,4,5};
        int[] [] myNumbers = {{1,2,3,4,5},{6,7,8,9,10}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
          }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i);
        }
        System.out.println(cars[2]);
        System.out.println("La longitud de la matriz es " + cars.length);
        System.out.println(Mynum[3]);
        System.out.println("La longitud de la matriz es " + Mynum.length);
    }
}
