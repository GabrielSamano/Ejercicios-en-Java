import java.util.Scanner
// Codigo para convertir el tipo de monedas que hay 
public class Conversion{
    Scanner lector = new Scanner(System.in);


public Conversion(){
    float pDolar, dolares, cPeso;

    System.out.println("Ingrese el valor del dolar: ");
    pDolar=lector.nextFloat();
    System.out.println("Ingrese la cantidad de dolares: ");
    dolares=lector.nextFloat();
    
    cPeso = dolares*pDolar;
    System.out.println(dolares + " dolares equivalen a " + cPeso + " Pesos");

}
  
    public static void main(String[] args){

        Conversion Solucion = new Conversion()

    }
}

