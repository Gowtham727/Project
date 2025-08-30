import java.util.Random;

public class Quicksort {
    public static int[] sort(int[] array,int left,int right){
        if (left<right){
            int pivotindex=partition(array,left,right);
            sort(array,left,pivotindex-1);
            sort(array,pivotindex+1,right);
        }
        return array;
    }
    public static int partition(int[] array, int left, int right){
        int pivot=array[right];
        int i=left-1;
        for (int j = left; j < right; j++) {
            if(array[j]<=pivot){
                i++;
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }

        }
        int temp=array[right];
        array[right]=array[i+1];
        array [i+1]=temp;
        return i+1;
    }
    public static int[] generate(int size,int max){
        int array[]=new int[size];
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            array[i]=random.nextInt(max);
        }
        return array;
    }
    public static void main(String[] args) {
            int size=10;
            int max=100;
            int [] arr= generate(size,max);
            for(int y:arr){
                System.out.print(y+"  ");

            }
            System.out.println();
            int[] arrays=  sort(arr,0,arr.length-1);
            for(int x:arrays){
                System.out.print(x+"  ");
            }


    }
}
