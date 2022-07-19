import java.util.Scanner;

class Usuario{
    public static void main(String[] args) {
        Scanner myObjt = new Scanner(System.in);
        System.out.println("Ingresa un Nombre: ");

        String UserName = myObjt.nextLine();
        System.out.println("Username is: " + UserName);
    }
}