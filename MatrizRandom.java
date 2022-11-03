import java.util.Random;
    public class Aleatorio {
        public static void main(String[] args) {

            Random r=new Random();
            int[][] a=new int[3][3]; /* Se creara una matriz de 3x3 de numeros aleatorios */
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    a[i][j]=r.nextInt(100);
                    System.out.print(a[i][j]+"\t");
                }

                System.out.print("\n");
            }

        }
}
