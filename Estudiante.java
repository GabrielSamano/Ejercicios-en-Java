import java.util.Scanner;

public class Estudiante {
    Scanner alumno = new Scanner(System.in);
    String name;
    int dateofbirth;
    int year;
    String group;
    int telephone;

    public Estudiante(String name, int dateofbirth, int year, String group, int telephone){
        this.name=name;
        this.dateofbirth=dateofbirth;
        this.year=year;
        this.group=group;
        this.telephone=telephone;

    }
    public static void main(String[] args) {
        Scanner alumno = new Scanner(System.in);
        Estudiante est = new Estudiante(null, 0, 0, null, 0);
        System.out.println("Ingresa tu nombre: ");
        String name = alumno.nextLine();
        // Ingresar los datos de los estudiantes
        System.out.println("Ingresa tu año de Nacimiento: ");
        int dateofbirth = alumno.nextInt();

        System.out.println("Ingresa tu Edad: ");
        int year = alumno.nextInt();

        System.out.println("Ingresa tu Grupo: ");
        String group = alumno.next();

        System.out.println("Ingresa tu Telefono: ");
        int telephone = alumno.nextInt();
        // Resultados de los datos ingresados 
        System.out.println("Tu Nombre es: " + name);
        est.name=name;

        System.out.println("Tu Fecha de nacimiento es: " + dateofbirth);
        est.dateofbirth=dateofbirth;
        
        System.out.println("Tu Edad es: " + year);
        est.year=year;
        
        System.out.println("Tu Grupo es: " + group);
        est.group=group;
        
        System.out.println("Tu Telefono es: " + telephone);
        est.telephone=telephone;
    }
}


