public class FirstLastPos {
    public static int binarysearch(int[] array,int target){
        int start=0;
        int end=array.length-1;
        int result=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==array[mid]){
                result=mid;
              end = mid-1;
            } else if (target<array[mid]) {
                end=mid-1;

            } else{
                start=mid+1;
            }


        }
        return result;



    }

    public static void main(String[] args) {
        int[] array={5,7,7,7,7,8,8,10};

     int value= binarysearch(array,7);
        System.out.println("the first positon is :"+value);
      int value1=  binarysearch1(array,7);
        System.out.println("the second positon is :"+value1);

    }

    public static int binarysearch1(int[] array, int target) {
        int start=0;
        int end=array.length-1;
        int result=0;
        while(start<=end){
            int mid_right=start+(end-start)/2;
            if(target==array[mid_right]){
                result=mid_right;
                start=mid_right+1;

            }
            else if (target<array[mid_right]) {
                end=mid_right-1;
            }
            else{
                start=mid_right+1;
            }

        }
        return result;


    }
}
