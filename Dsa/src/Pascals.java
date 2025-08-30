public class Pascals
{
    public static void main(String[] args){
        int n=10;
        int[][] array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){ //for 1st and last element should be 1
                   array[i][j]=1;
                }
                else{
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                        }
                System.out.print(array[i][j] +" ");
                    }
            System.out.println();
                }




                }
            }




