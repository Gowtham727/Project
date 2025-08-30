public class BitonicSearch {
    public static int binary(int[] array){
        int start=0;
        int end=array.length-1;

        while(start<end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid+1]){

                end=mid;
            }
            else{

                start=mid+1;
            }
        }
        return end; //ceil because pointer moves
    }
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,39,38,37};
        int value= binary(array);
        System.out.println(array[value]);

    }
}
