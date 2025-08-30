package Examproblems;

public class Bubblesort {
    public static void main(String[] args) {
        int [] nums={5, 4, 3, 2, 1};
       int array[]= bubbleosort(nums);
       for (int x:array){
           System.out.print(x +" ");
       }
    }
    public static int[] bubbleosort(int[] array){
        for(int i=0;i< array.length-1;i++){
            for (int j = 0; j < array.length-1; j++) {
                if(array[j+1] < array[j]){  //adjacent element comaprision  array.length-1 because j+1
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
                }

            }
        }
        return array;
    }
}
