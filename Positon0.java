import java.util.Scanner;

public class Positon0 {
    static int k=0;
    static int l=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=3;
        int cols=3;
        int[][] matrix=new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=scanner.nextInt();
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                     k=i;
                     l=j;
                }

            }

        }
        int[][] newmatrix=new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i!=k ){
                    newmatrix[i][j]=matrix[i][j];   //changing the reference it makes the assigns unmarked values to 0
                }
//                else{
//                    if(j!=l){
//                        newmatrix[i][j]=matrix[i][j];
//                    }
//                }

            }

        }
        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix[i].length; j++) {
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}
