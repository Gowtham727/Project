public class Zeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);

    }
    public static void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        for(int x:nums){
            System.out.println(x);}


    }
}


