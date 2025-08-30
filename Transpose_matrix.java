import java.util.Scanner;

public class Transpose_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 3;
        int cols = 3;
        int[][] array = new int[row][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] array1 = new int[row][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i != j) {
                    array1[j][i] = array[i][j];   //01 <->10   02 <->20   03 <->30
                    System.out.println(array[i][j] + "index at " + j + i);
                }
                else {
                    array1[i][j]=array[i][j];
                    System.out.println(array[i][j] + "index at " + j + i);

                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();


        }
    }
}
