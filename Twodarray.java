import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in );
        int row=3;
        int cols=3;
        int[][] array=new int[row][cols];
        for(int i=0;i<array.length;i++){
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<array.length;i++){
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            int k=i;

            for (int j = 0; j <array[i].length ; j++) {
                              //if(i+i==i+j) to add diagonol element{
                    sum+=array[i][j];
                }

            }
            System.out.println("total value is "+sum);
        }
    }

