import java.util.Scanner;

class User{
    public static void main(String[] args) {
        Scanner myObjt = new Scanner(System.in);

         System.out.println("Ingresa Nombre, edad, sueldo");

         // Ingreso de Usuario
         String name = myObjt.nextLine();

         // INgreso de datos numericos
         int age = myObjt.nextInt();
         double salary = myObjt.nextDouble();

         // Salida de Usuario
         System.out.println("Nombre: " + name);
         System.out.println("Edad: " + age);
         System.out.println("Salario: " + salary);

    }
}
