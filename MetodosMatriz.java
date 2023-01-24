import java.util.ArrayList;

public class METODO{
    public static int apariciones(double matriz [] [], double dato[]){
        int apariciones = 0;
        for (int i = 0; i < matriz.lenght; i++ ) {
            for (int j = 0; j < matriz[i].lenght; j++) {
                if (matriz[i][j] == dato) {
                    apariciones++;
                }
            }
        }
        return apariciones;
    }

}
