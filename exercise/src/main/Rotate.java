package Examproblems;

public class Rotate {
    public static void main(String[] args) {
        int nums[]={7, 8, 9, 10};
        int rotate=6;
        int [] arrays=rotate(nums,rotate);
        for(int x:arrays){
            System.out.print(x +" ");
        }
    }
    public static int[] rotate(int [] array,int rotate){
        int n=array.length;
        while(rotate!=0){
            int last=array[n-1];
            for(int i=n-2;i>=0;i--){
                  array[i+1]=array[i];

            }
            array[0]=last;
            rotate--;
        }
        return array;
    }
}
