public class Solution {
      static  int k=0;
    public static void main(String[] args) {
        int[] array = {2,1,4,7,3,2,5};
      int value=  longestMountain(array);
        System.out.println(value);}
    public  static int longestMountain(int[] arr) {
        int res = peak(arr,0,arr.length-1);
        int ans1=  asc(arr,0,res);
        int ans2= desc(arr,res+1,arr.length-1);
        return ans1+ans2;

    }
    public  static int peak(int [] nums,int start,int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid] < nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
public static int asc(int[] nums, int start, int end){  //sorting logic
    for(int i=0;i<end;i++){
        for(int j=i+1;j<end;j++){
            if(nums[j]>nums[i] && nums[j]!=nums[i]){
                 k++;

            }
        }
    }
    return k;
}
public static int desc(int[] nums, int start, int end){
    for(int i=start;i<end;i++){
        for(int j=i+1;j<end;j++){
            if(nums[j]<nums[i] && nums[j]!=nums[i]){
                k++;

            }
        }
    }
    return k;

}
}

