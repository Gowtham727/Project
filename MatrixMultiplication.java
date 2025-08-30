import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=3;
        int cols=3;

        int[][] a=new int [rows][cols];
        int [][] b=new int[rows][cols];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               a[i][j]= scanner.nextInt();
            }

        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]= scanner.nextInt();
            }
           // System.out.println();

        }

        int[][] newarray=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++) {
               // newarray[i][j]=0;
                for (int k = 0; k < cols; k++) {
                  newarray[i][j]+=a[i][k]*b[k][j];
                }
            }
           // System.out.println();



        }
        for (int[] ints : newarray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
}
