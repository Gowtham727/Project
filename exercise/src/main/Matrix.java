package Examproblems.matrixproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = 3;
//        //getting the matrix
//
//        int[][] matrix =
//                { {1},
//        {0},
//        {3}
//    };


        //printing the matrix
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//        //searching in the matrix
//        for (int i = 0; i < n ;i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j]==5){
//                    System.out.println(Arrays.toString(new int[]{i, j}));
//                }
//            }
//
//        }
//        //disagonal to 0
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i==j){
//                     matrix[i][j] = 0;
//                }
//              }
//


//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j]);
//
//            }
//            System.out.println();
//
//        }
        //transpose
//         int k=0;
//        int[] [] newmatrix=new int[n][n];
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n; j++) {
//            newmatrix[j][i]  = matrix[i][j];
//            }
//
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(newmatrix[i][j]+" ");
//
//            }
//            System.out.println();
//
//        }

        int[][] matrix =
                { {1},
                        {0},
                        {3}
                };
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }

            }

        }
//        //row
//        for (int i = 0; i < row.length; i++) {
//            System.out.print(row[i] + " ");
//        }
//        System.out.println();
//        //col
//        for (int j = 0; j < col.length; j++) {
//            System.out.print(col[j] + " ");
//        }
        for (int k = 0; k < row.length; k++) {
            if (row[k] == 1) {
                zeros(k, matrix);

            }
        }
        for (int k = 0; k < col.length; k++) {
            if (col[k] == 1) {
                zeroscols(k, matrix);

            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }


    }

    public static int zeros(int k, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  //related to row
                if (k == i) {
                    matrix[i][j] = 0;
                }
            }
        }
        return k;
    }
    public static int zeroscols(int k, int[] [] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j==k){
                    matrix[i][j]=0;
                }

            }
        }return k;
    }
}