package Examproblems.matrixproblems;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] nums={1,13,10,12,31};

       int tot= countDistinctIntegers(nums);
        System.out.println(tot);
    }
        public static int countDistinctIntegers(int[] nums) {
            for(int i=0;i<nums.length;i++){
                int n=nums[i];
                reversed(n,nums);
            }
            Arrays.sort(nums);
            int ans=  duplicates(nums);
            return ans;
        }

        public static  int reversed(int n,int[] nums){
        int newarray[]=new int[nums.length*2];
        //reverse each values and append
            for(int i=0;i<nums.length;i++){
                newarray[i]=nums[i];
            }
            int reverse=0;
            while(n!=0){
                reverse=n%10;
                n=n/10;
                if(n==0){
                    int k=nums.length+1;
                    newarray[k]=reverse;
                }
            }
            return 1;
        }
        public static int duplicates(int[] array){
            int k=0;
            int count=0;
            for(int i=0;i<array.length-1;i++){
                if(array[i]!=array[k])
                {
                   count++;
                }

            }
            return count;
        }


    }
