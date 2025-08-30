public class RotateBoolean {
    public static void main(String[] args) {
        int[] nums = { 1, 2,3};
        int target = 4;
        boolean ans = search(nums, target);
        System.out.println(ans);
    }
    public static boolean search(int[] nums, int target) {
        int start=1,end=nums.length;
        boolean left=false,right=false;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid-1] > nums[mid]){
                left=  binarysearch(nums,target,0,mid-1);
                right= binarysearch(nums,target,mid,end-1);
                if(left){
                    return true;
                }
                else if(right){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                start++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;

    }
    public static boolean binarysearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if(target <= nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
