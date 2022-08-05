import java.util.ArrayList;

public class lamb {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(10);
        numbers.add(3);
        numbers.forEach((n) ->{System.out.println(n);});
    }

}
