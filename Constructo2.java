public class Constructo2 {
    int modelyear;
    String modelName;

    public Constructo2(int year, String name){
        modelyear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        Constructo2 myCar = new Constructo2(1997, "Ferrari");
        System.out.println(myCar.modelyear + " " + myCar.modelName);
    }
}
