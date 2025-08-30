package Examproblems;

import java.util.Arrays;

public class FirstPositive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int n=nums.length-1;
       int value= missing(nums,n);
        System.out.println(value);
    }
    public static int missing(int [] nums,int n){
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){  //no nested loops so i<=n
            if(nums[i] != i){
                return i;
            }
        }
        return n+1;
    }
}
