import java.util.Random;

public class BinarySearch {
    static int target=0;
    public static int binarysearch(int [] array,int target){
        int l=0;
        int r= array.length;
        while(l<r){
            int pos=l+(r-l)/2;
            if(target == array[pos]){
                return pos;
            }
            if(target<array[pos]){
                r=pos-1;
            }
            else{
                l=pos+1;
            }
        }
        return l;

    }
    public static int[] generate(int size,int max){

        int[] array =new int[size];
        Random random=new Random();
        for(int i=0;i<size;i++){
            array[i]=random.nextInt(max);
        }
        return array;

    }
    public static int[] sort(int [] array){
        int length= array.length;
        for(int i=1;i<length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && key<=array[j]){
                array [j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
        return array;

    }
    public static void main(String[] args) {
        int size=10;
        int max=100;
        int[] array= generate(size,max);
        System.out.println("unsorted array");
        for(int x:array){
            System.out.print(x +" ");
        }
        int[] arrays=sort(array);
        System.out.println("sorted array");
        for(int x:arrays) {

            System.out.print(x + " ");
        }
        target=10;
        int value= binarysearch(arrays,target);
        System.out.println("the value is "+array[value]
        );
    }
}
