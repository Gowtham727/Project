public class SearchInRotated {
    public static void main(String[] args) {
        int[] nums = { 1, 2,3};
        int target = 4;
        int ans = search(nums, target);
        if(ans!=0){
        System.out.println(ans);}
        else{
            for (int i = 0; i < nums.length; i++) {
                                 if(nums[i]==target){
                                     System.out.println(i);
                                 }
            }
        }
        System.out.println(-1);
    }


    //    public static int[] search(int[] nums, int target) {
//        int left = 0, right = 0;
//        int start = 1, end = nums.length, mid = 0;
//        while (start < end) {
//            mid = start + (end - start) / 2;
//            if (nums[mid - 1] > nums[mid]) {
//                left = binarysearch(0, mid - 1, nums, target);
//                right = binarysearch(mid, end-1, nums, target);
//                return new int[]{left, right};
//            } else {
//                start++;
//            }
//        }
//        return new int[]{};
//    }
//
//
//    public static int binarysearch(int start,int end,int[] nums,int target){
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(nums[mid]==target){
//                return mid;
//            }
//            if( target<=nums[mid]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
    public static int search(int[] nums, int target) {
        int left = 0, right = 0;
        int start = 1, end = nums.length, mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid - 1] > nums[mid]) {
                left = binarysearch(0, mid - 1, nums, target);
                right = binarysearch(mid, end - 1, nums, target);
                if (left != -1) {
                    return left;
                } else if (right != -1)


                 {
                    return right;
                } else {
                    return -1;
                }
            } else {
                start++;
            }
        }
        return 0;

    }

    public static int binarysearch(int start, int end, int[] nums, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return nums[mid];
            }
            if (nums[mid] <= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}