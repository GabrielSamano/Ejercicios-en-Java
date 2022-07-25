enum Lev{
    High,
    Medium,
    Low
}
public class buc {
    public static void main(String[] args) {
        for (Lev myVar :  Lev.values())
        System.out.println(myVar);    
    }
    
}
