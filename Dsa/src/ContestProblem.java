import java.util.Arrays;

public class ContestProblem {
    public static void main(String[] args) {
        int[] arr={1000000000,1000000000,1000000000,1000000000,1000000000,1000000000,1,1,1};
        System.out.println( maximumMedianSum(arr));
    }

    public static long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        long ans=0;
        int len=nums.length/2;
        if(nums.length == 3){
            return nums[len];
        }
        for(int i=0;i<nums.length;i++){

            int temp=nums[len]+nums[i];
            ans=Math.max(sum,temp);

        }
        return ans;

    }
    }



