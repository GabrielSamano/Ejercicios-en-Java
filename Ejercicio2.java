import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Introduzca un numero"); // INgresas un numero entero 

        int num=sn.nextInt();

        char caracter=(char)num;  // Los caracteres son asignados por numeros 

        System.out.println("El numero " +num+ "corresponde al caracter '" +caracter+ "'");
    }
    
}

