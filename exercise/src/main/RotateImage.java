package Examproblems.matrixproblems;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            int col=matrix.length-1-i;
            for (int j = 0; j < temp[0].length; j++) {
                if(i==0 &&  j==0 || i==1 && j==0||i==2 && j==0){
                                                              //focusees the firrst element on each rows so 0,1,2
                   matrix[j][col] =temp[i][j];
                }
                else if(i==0 && j==1 || i==1&& j==1 || i==2 && j==1){

                    matrix[j][col]=temp[i][j];
                }
                else{
                    matrix[j][col]=temp[i][j];
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
