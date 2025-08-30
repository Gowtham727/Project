package recursion;

public class Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 54, 22, 4, 3};
        System.out.println(find(array, 0, 0));
    }
    public static int find(int [] array,int target,int start){
        if(start>array.length-1){
            return -1;

        }
        if(array[start]==target){
            return array[start];
        }
       return  find(array,target,start+1);

    }

}
