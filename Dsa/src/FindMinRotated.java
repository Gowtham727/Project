import java.util.Arrays;

public class FindMinRotated {
    public static void main(String[] args) {
        int[] nums = { 3 ,1,2};

        int ans = search(nums);
        System.out.println(ans);
    }
    public static int search(int[] nums) {
        int left = 0, right = 0;
        int start = 1, end = nums.length, mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid - 1] > nums[mid]) {
               return nums[mid];
            } else {
                start++;
            }
        }
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
            break;
        }
return 0;
    }
}
