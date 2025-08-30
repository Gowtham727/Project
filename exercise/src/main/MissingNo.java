package Examproblems;

import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
    int[] nums={3,0,1};
    int n=nums.length-1;
   int value= missing(nums,n);
        System.out.println(value);}
    public static int missing(int [] nums,int n){
         Arrays.sort(nums);

         for(int i=0;i<=n;i++){
             if(i!=nums[i]){
                 return i;
             }
         }
         return n+1;
    }
}
