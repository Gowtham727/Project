package Examproblems;

public class Selectionsort {
    public static void main(String[] args) {
        int[] nums={5, 4, 3, 2, 1};
        int[] array = bubbleosort(nums);
        for (int x:array){
            System.out.print(x +" ");
        }
    }
    public static int[] bubbleosort(int[] array){
        for(int i=0;i< array.length;i++){
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i]){  //smaller emenet in each iteration swaps
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }

            }
        }
        return array;
    }
}
