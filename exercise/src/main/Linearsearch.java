import java.util.Random;
public class Linearsearch {
    public static int linearsearch(int [] array,int target){
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==target){
                return target;
            }
        }
        return -1;

    }
    public static int[] generate(int size,int max){
        int array[]=new int[size];
        Random random=new Random();
        for(int i=0;i<size;i++){
            array[i]=random.nextInt(max);
        }
        return array;
    }
    public static void main(String[] args) {
        int size=10;
        int max=100;
       int[] array= generate(size,max);
       for(int x:array){
           System.out.print(x +" ");
       }
      int value= linearsearch(array,10);
      if(value==-1){
          System.out.println("the target in not found");
      }
      else{
          System.out.print("found" +value);
      }

    }
}
