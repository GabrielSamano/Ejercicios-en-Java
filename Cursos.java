import java.util.Scanner;

public class Cursos {
    int CourseCode;
    String Title;
    int Hours;


    public Cursos(int CourseCode, String Title, int Hours){
        this.CourseCode= CourseCode;
        this.Title= Title;
        this.Hours= Hours;
    }

    public static void main(String[] args) {
        Scanner cur = new Scanner(System.in);
        // Ingrsar datos
        System.out.println("Ingresa el codigo del curso: ");
        int CourseCode = cur.nextInt();
        System.out.println("Ingresa el titulo del curso: ");
        String Title = cur.next();
        System.out.println("Ingresa el numero de horas del curso: ");
        int Hours = cur.nextInt();
        // Mostrar los datos Ingresados
        System.out.println("El codigo del curso es: " + CourseCode);
        System.out.println("El titulo del curso es: " + Title);
        System.out.println("Las horas del curso son: " + Hours);
    }
}
