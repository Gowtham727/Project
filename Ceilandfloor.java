public class Ceilandfloor {
    public static int binarysearch(int start,int end,int[] array,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] array={1,3,5,6,9};
        int start=0;
        int end=array.length-1;
       int value= binarysearch(start,end,array,4);
        System.out.println(array[value]);
    }
}
