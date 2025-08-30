package Examproblems.matrixproblems;

public class Reshape {
    public static void main(String[] args) {

        //flipping the image
        int[][] matrix =  {{1,1,0},{1,0,1},{0,0,0}};
        int[][]newmatrix=new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();

        }

        for (int i = 0; i < matrix.length; i++) {
            int k= matrix.length-1;
            for (int j = 0; j < matrix[0].length; j++) {
                newmatrix[i][k--]=matrix[i][j];

            }

        }
        System.out.println();
        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix[0].length; j++) {
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix[0].length; j++) {
                if(newmatrix[i][j]==1){
                    newmatrix[i][j]=0;
                }
                else{
                    newmatrix[i][j]=1;}

            }

        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix[0].length; j++) {
                System.out.print(newmatrix[i][j] +" ");

            }
            System.out.println();

        }
    }
    }


