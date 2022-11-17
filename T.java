

enum Level{
    ALTO,
    MEDIO,
    BAJO
}
public class T {
    public static void main(String[] args) {
        Level myVar = Level.MEDIO;

        switch(myVar) {
            case ALTO:
            System.out.println("EL nivel es alto");
            break;
            case MEDIO:
            System.out.println("El nivel es medio");
            break;
            case BAJO:
            System.out.println("El nivel es bajo");
            break;
        }
    }
}



