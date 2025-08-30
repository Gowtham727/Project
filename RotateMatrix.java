import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=3;
        int cols=3;
        int[][] matrix=new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) { //getting the input
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) { //displaying the 2d matrix
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int[][] newmatrix=new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {   //transpose of the matrix
            for (int j = 0; j < matrix[i].length; j++) {
                if(i!=j){
                    newmatrix[j][i]=matrix[i][j];

                }
                else{
                    newmatrix[i][j]=matrix[i][j];
                }
            }
        }
        for (int i = 0; i < newmatrix.length; i++) { //displaying the transpose of 2d matrix
            for (int j = 0; j < newmatrix[i].length; j++) {
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println();
        }

        int[][] newmatrix1=new int[rows][cols];
        for (int i = 0; i < newmatrix.length; i++) {
            int k= newmatrix.length-1; //taks index
            for (int j = 0; j < newmatrix[i].length; j++) {
                newmatrix1[i][k--]=newmatrix[i][j];

            }

        }
        for (int i = 0; i < newmatrix1.length; i++) {
            for (int j = 0; j < newmatrix1[i].length; j++) {
                System.out.print(newmatrix1[i][j]+" ");
            }
            System.out.println();

        }
    }
}
