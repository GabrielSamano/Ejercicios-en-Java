// Metodos de clase //
// Estatico y no estatico //
public class J10 {
    static void myStaticmethod(){
        System.out.println("Los metodos estaticos pueden ser llamados sin crear objetos");
    }
    public void myPublicmethod(){
        System.out.println("Los metodos publicos podrian ser llamados para crear objetos");
    }
    public static void main(String[] args) {
        myStaticmethod();
        J10 myObj = new J10();
        myObj.myPublicmethod();
    }
}
