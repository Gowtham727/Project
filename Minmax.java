import java.util.Random;

public class Minmax {
    public static void minmax(int[] array)
    {
        int min=array[0];
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] <= min){
                min=array[i];
            }

        }
        System.out.println("the min value is "+min);
        for (int i = 1; i < array.length; i++) {
            if(array[i] >=max){
                max=array[i];
            }

        }

        System.out.println("the max value is "+max);
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
            minmax(arr);

    }
}
