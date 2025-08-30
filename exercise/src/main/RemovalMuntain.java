package Examproblems;

public class RemovalMuntain {
   static  int k=0;
    public static void main(String[] args) {
    int[] array={1,2,3,4,5,3,2,1

};
    int ans=minimumMountainRemovals(array);
        System.out.println(ans);}
    public static int minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        int peakvalue=   peak(nums,k,n-1);
      //  System.out.println(peakvalue);
        int res= asc(n,nums,0,peakvalue);
        int res1= desc(n,nums,peakvalue+1,n-1);
        return res+res1;

    }
    public  static int peak(int[] nums,int k,int end){
      int  start=k;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid] < nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        if(start==k || start==nums.length-1){
            k++;
           return  peak(nums,k,nums.length-1);
        }
        return start;

    }
    public static  int asc(int n,int [] nums,int start,int end){
        int j=0;
        for(int i=0;i<end-1;i++){
            if(nums[i+1] <= nums[i])
            {
                j++;
            }
        }
        return j;

    }
    public  static int desc(int n,int [] nums,int start,int end){
        int j=0;
        for(int i=start-1;i<n-1;i++){
            if(nums[i+1] >= nums[i])
            {
                j++;
            }
        }
        return j;

    }

}
