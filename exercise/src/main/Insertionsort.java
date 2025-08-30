package Examproblems;

public class Insertionsort {
    public static int[] insertionsort(int[] array)
    {
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array={8,7,6,5,4,3,2,1};
      int []arr=  insertionsort(array);
      for (int x:arr){
          System.out.print(x+" ");
      }
    }
}
