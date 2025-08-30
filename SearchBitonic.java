public class SearchBitonic {
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
       int leftsearch= binaryleft(array,value,37);
       if(leftsearch!=-1){
           System.out.println(array[leftsearch]);
       }

     int rightsearch= binaryright(array,value,37);
       if(rightsearch!=-1){
        System.out.println(array[rightsearch]);}

    }
    public static int binaryleft(int []array,int limit,int target){
        int start=0;
        int end=limit;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            if(target<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
   public static int binaryright(int []array,int limit,int target){
        int start=limit;
        int end=array.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            if(target<array[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
}
