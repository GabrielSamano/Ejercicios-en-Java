// Metodo de sobrecarga //
public class J9 {
    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int MyNum1 = plusMethodInt(7, 15);
        double MyNum2 = plusMethodDouble(15.321, 2.124);
        System.out.println("Int: " + MyNum1);
        System.out.println("Double: " + MyNum2);
    }
}
