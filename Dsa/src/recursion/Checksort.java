package recursion;

public class Checksort {
    public static void main(String[] args) {
        int[] arr={2,4,6,9};
        System.out.println(find(arr,0));
    }
    public static boolean find(int[] array,int start){
       if(array.length==0){
           return false;
       }
        if(start==array.length-1){
            return true;
        }
        if(array[start] > array[start+1]){
            return false;}
       return  find(array,start+1);
    }
}
