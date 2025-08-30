package Examproblems.matrixproblems;

public class Sumofdig {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        int value=0;
        int res= diagnol1(mat,sum);
        int res2= diagnol2(mat,value);
        System.out.println( res+res2);
    }
    public static int diagnol1(int[][] mat,int sum){
        for(int i=0;i<mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;

    }
    public  static int diagnol2(int[][]mat,int value){
        int n=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(j==n ) {
                    if (i != j) {
                        value = value + mat[i][j];
                        n--;
                    }
                    else{
                        n--;
                    }
                }
            }
        }
        return value;
    }
    }

