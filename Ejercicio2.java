import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Introduzca un numero");

        int num=sn.nextInt();

        char caracter=(char)num;

        System.out.println("El numero " +num+ "corresponde al caracter '" +caracter+ "'");
    }
    
}
