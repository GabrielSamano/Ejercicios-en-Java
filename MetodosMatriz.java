import java.util.ArrayList;

public class METODO{
    public static int apariciones(double matriz [] [], double dato[]){  /*"La matriz sera minimo de dos elementos"*/
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
    public static double numeroMenor(double matriz[][]){
        double dato = matriz[0][0];
        for (int i = 0; i < matriz.lenght; i++) {
            for(int j = 0; j < matriz[i].lenght; j++) {
                if (matriz[i][j] < dato) {
                    dato = matriz [i] [j];
                }
            }
        }
        return dato;
    }
}

