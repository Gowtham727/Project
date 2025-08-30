import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 1 && j != 2) {
                   continue;
                } else {
                    arrayList.add(matrix[i][j]);
                }
            }
           // System.out.println(arrayList);
        }
        int k=matrix.length-1;
        for (int i = matrix.length-1; i>1; i--) {
            for (int j = k; j >=0; j--) {
                arrayList.add(matrix[i][j]);

            }

        }
        System.out.print(arrayList);
    }
}
