import java.util.Random;

public class Selectionsort {
         public static int[] selectionsort(int[] array){
             int length= array.length;
             for(int i=0;i<length;i++){
                 int min=i;
                 for(int j=i+1;j< array.length;j++) {
                     if (array[j] < array[min]) {
                         min = j;
                     }
                 }
                 int temp=array[min];
                array[ min]=array[i];
                array[i]=temp;
             }
             return array;

         }

    public static int[] generate(int size, int max) {
        int array[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 10;
        int max = 100;
        int[] array = generate(size, max);
        for (int x : array) {
            System.out.print(x + " ");
        }
        int value[] = selectionsort(array);
        for (int x : value) {
            System.out.print(x + " ");
        }

    }
}
